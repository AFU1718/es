package com.yfgz.es.service;

import com.alibaba.fastjson.JSONObject;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.yfgz.es.bean.LogToEs;
import com.yfgz.es.utils.Result;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.metrics.avg.Avg;
import org.elasticsearch.search.aggregations.metrics.sum.Sum;
import org.elasticsearch.search.aggregations.metrics.sum.SumAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;


@Service
public class ElasticsearchService {
    @Autowired
    private TransportClient client;


    public Result addDocumentStart(Integer userId, String index, String type, String page) {

        Timestamp now = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String time = format.format(now);
        JSONObject object = new JSONObject();
        object.put("userId", userId);
        object.put("page", page);

        object.put("startTime", time);
        IndexRequestBuilder indexRequestBuilder = client.prepareIndex(index, type);
        IndexResponse response = indexRequestBuilder.setSource(object).get();
        return Result.success();
    }

    public Result addDocumentEnd(Integer userId, String index, String type, String page) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String time = format.format(now);
        JSONObject object = new JSONObject();
        object.put("userId", userId);
        object.put("page", page);
        object.put("endTime", time);
        IndexResponse response = client.prepareIndex(index, type).setSource(object).get();
        return Result.success();
    }
    public Result addDocumentLog(LogToEs obj){
        if (obj.getUserId()!=null){
        Timestamp now = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(now);
        String index="shop"+obj.getShopId().toString();
        String esType=obj.getEsType();
        JSONObject object=obj.getData();
        object.put("userId",obj.getUserId());
        object.put("time",time);
        IndexResponse response = client.prepareIndex(index, esType).setSource(object).get();
        return Result.success();}else {
            return Result.failed("userId为空！");
        }
    }


    /**
     * @param @param object  要增加的数据
     * @param @param index   索引，类似数据库
     * @param @param type    类型，类似表
     * @param @param id      id
     * @return void
     * @throws
     * @Title: addIndex
     * @Description: TODO  单个索引增加
     */
    public void addDocument(JSONObject object, String index, String type, String id) {
        IndexResponse response = client.prepareIndex(index, type, id).setSource(object).get();
    }


    /**
     * @param @param  index
     * @param @param  type
     * @param @param  id
     * @param @return
     * @return Map<String                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               Object>
     * @throws
     * @Title: getIndex
     * @Description: TODO 获取某条信息
     */
    public Map<String, Object> getDocument(String index, String type, String id) {
        GetResponse response = client.prepareGet(index, type, id).get();
        Map<String, Object> map = response.getSource();
        return map;
    }

    /**
     * @param @param index
     * @param @param type
     * @param @param id
     * @return void
     * @throws
     * @Title: delDocument
     * @Description: TODO 删除某条信息
     */
    public void delDocument(String index, String type, String id) {
        DeleteResponse response = client.prepareDelete(index, type, id).get();
    }

    /**
     * @param @param index
     * @param @param type
     * @param @param id
     * @return void
     * @throws
     * @Title: delDocument
     * @Description: TODO 更新某条信息 ,如果改动很多，直接用新增的也可以，只要id相同即可
     */
    public void updateDocument(String index, String type, String id, String key, String value) throws Exception {
        UpdateRequest updateRequest = new UpdateRequest(index, type, id);
        updateRequest.doc(jsonBuilder().startObject().field(key, value).endObject());
        client.update(updateRequest).get();
    }


    public Result sumQueryTotalTimeByUserIdAndPage(Integer userId, String index, String type, String page, String fromTime, String toTime) throws Exception {
        Map<String, Long> result = new HashMap<>();

        SearchResponse searchResponseStart = client.prepareSearch(index).setTypes(type)
                .setQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("userId", userId))
                        .must(QueryBuilders.termQuery("page.keyword", page))
                        .must(QueryBuilders.existsQuery("startTime"))
                        .must(QueryBuilders.rangeQuery("startTime").from(fromTime).to(toTime)))
                .addAggregation(AggregationBuilders.avg("avgStartTime").field("startTime"))
                .execute().actionGet();
        Long totalNumber = searchResponseStart.getHits().getTotalHits();
        Avg avgStartTime = searchResponseStart.getAggregations().get("avgStartTime");
        Double avgStart = avgStartTime.getValue();

        SearchResponse searchResponseEnd = client.prepareSearch(index).setTypes(type)
                .setQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("userId", userId))
                        .must(QueryBuilders.termQuery("page.keyword", page))
                        .must(QueryBuilders.existsQuery("endTime"))
                        .must(QueryBuilders.rangeQuery("endTime").from(fromTime).to(toTime)))
                .addAggregation(AggregationBuilders.avg("avgEndTime").field("endTime"))
                .execute().actionGet();

        Avg avgEndTime = searchResponseEnd.getAggregations().get("avgEndTime");
        Double avgEnd = avgEndTime.getValue();


        Long totalTime = Math.round((avgEnd - avgStart) * totalNumber);
        result.put("totalTime", totalTime);
        result.put("totalNumber", totalNumber);
        return Result.success(result);
    }

    public Result sumQueryTotalByPage( String index, String type, String page,String fromTime, String toTime) {
        Map<String, Long> result = new HashMap<>();

        SearchResponse searchResponseStart = client.prepareSearch(index).setTypes(type)
                .setQuery(QueryBuilders.boolQuery()
                        .must(QueryBuilders.termQuery("page.keyword", page))
                        .must(QueryBuilders.existsQuery("startTime"))
                        .must(QueryBuilders.rangeQuery("startTime").from(fromTime).to(toTime)))
                .addAggregation(AggregationBuilders.avg("avgStartTime").field("startTime"))
                .execute().actionGet();
        Long totalNumber = searchResponseStart.getHits().getTotalHits();
        Avg avgStartTime = searchResponseStart.getAggregations().get("avgStartTime");
        Double avgStart = avgStartTime.getValue();

        SearchResponse searchResponseEnd = client.prepareSearch(index).setTypes(type)
                .setQuery(QueryBuilders.boolQuery()
                        .must(QueryBuilders.termQuery("page.keyword", page))
                        .must(QueryBuilders.existsQuery("endTime"))
                        .must(QueryBuilders.rangeQuery("endTime").from(fromTime).to(toTime)))
                .addAggregation(AggregationBuilders.avg("avgEndTime").field("endTime"))
                .execute().actionGet();

        Avg avgEndTime = searchResponseEnd.getAggregations().get("avgEndTime");
        Double avgEnd = avgEndTime.getValue();

        Long totalTime = Math.round((avgEnd - avgStart) * totalNumber);
        result.put("totalTime", totalTime);
        result.put("totalNumber", totalNumber);
        return Result.success(result);
    }

    public Result sumQueryTotalTimeByUserId(Integer userId, String index, String type, String fromTime, String toTime) throws Exception {
        List<String> pages = new ArrayList<>();
        pages.add("page/index/index");
        pages.add("page/me/me");
        pages.add("page/myActivity/myActivity");
        pages.add("page/activityDetail/activityDetail");
        pages.add("page/aboutyf/aboutyf");
        pages.add("page/distributor/distributor");
        pages.add("page/settings/settings");
        pages.add("page/login/login");
        pages.add("page/order/order");
        pages.add("page/detail/detail");
        pages.add("page/coupon/coupon");
        pages.add("page/mycoupon/mycoupon");
        pages.add("page/list/list");
        pages.add("page/product/product");
        pages.add("page/shop/shop");
        pages.add("page/submit/submit");
        pages.add("page/register/register");
        pages.add("page/address/address");
        pages.add("page/addresses/addresses");
        pages.add("page/editAddress/editAddress");
        pages.add("page/cart/cart");
        pages.add("page/emptycart/emptycart");
        pages.add("page/success/success");
        pages.add("page/guangzi/guangzi");
        pages.add("page/outLink/outLink");
        Map<String, Map<String, Object>> pagesStatistics = new HashMap<>();
        for (String s : pages) {
            pagesStatistics.put(s, null);
        }

        SearchResponse searchResponseStart = client.prepareSearch(index).setTypes(type)
                .setQuery(QueryBuilders.boolQuery()
                        .must(QueryBuilders.termQuery("userId", userId))
                        .must(QueryBuilders.existsQuery("startTime"))
                        .must(QueryBuilders.rangeQuery("startTime").from(fromTime).to(toTime)))
                .addAggregation(AggregationBuilders.terms("groupByPage").field("page.keyword").subAggregation(AggregationBuilders.avg("avgStartTime").field("startTime")))
                .execute().actionGet();

        Terms termsStart = searchResponseStart.getAggregations().get("groupByPage");
        List<? extends Terms.Bucket> bucketsStart = termsStart.getBuckets();

        for (Terms.Bucket bucket : bucketsStart) {
            Map<String, Object> object = new HashMap<>();
            Avg avg = bucket.getAggregations().get("avgStartTime");
            Double avgStartTime = avg.getValue();
            System.out.println("现场成交价" + avgStartTime);
            Long totalStartNumber = bucket.getDocCount();

            object.put("avgStartTime", avgStartTime);
            object.put("totalStartNumber", totalStartNumber);
            pagesStatistics.put((String) bucket.getKey(), object);
        }

        SearchResponse searchResponseEnd = client.prepareSearch(index).setTypes(type)
                .setQuery(QueryBuilders.boolQuery()
                        .must(QueryBuilders.termQuery("userId", userId))
                        .must(QueryBuilders.existsQuery("endTime"))
                        .must(QueryBuilders.rangeQuery("endTime").from(fromTime).to(toTime)))
                .addAggregation(AggregationBuilders.terms("groupByPage").field("page.keyword").subAggregation(AggregationBuilders.avg("avgEndTime").field("endTime")))
                .execute().actionGet();

        Terms termsEnd = searchResponseEnd.getAggregations().get("groupByPage");
        List<? extends Terms.Bucket> bucketsEnd = termsEnd.getBuckets();

        for (Terms.Bucket bucket : bucketsEnd) {

            Map<String, Object> object = pagesStatistics.get((String) (bucket.getKey()));

            Avg avg = bucket.getAggregations().get("avgEndTime");
            Double avgEndTime = avg.getValue();
            Long totalEndNumber = bucket.getDocCount();

            object.put("avgEndTime", avgEndTime);
            object.put("totalEndNumber", totalEndNumber);
            Long totalTime = Math.round((Double) object.get("avgEndTime") - (Double) object.get("avgStartTime")) * (Long) (object.get("totalEndNumber"));
            object.put("totalTime", totalTime);
            pagesStatistics.put((String) bucket.getKey(), object);
        }
        return Result.success(pagesStatistics);

    }


}
