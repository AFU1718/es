package com.yfgz.es.controller.wx;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yfgz.es.annotation.AuthTokenRequired;
import com.yfgz.es.bean.LogToEs;
import com.yfgz.es.service.ElasticsearchService;
import com.yfgz.es.utils.Result;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/wx/es")
public class WxElasticsearchController {


    @Autowired
    private ElasticsearchService elasticsearchService;


    @AuthTokenRequired
    @RequestMapping(value = "/start", method = RequestMethod.POST)
    public Result addDocumentStart(@RequestParam Integer userId, @RequestParam String index, @RequestParam String esType, @RequestParam String page) {

        return elasticsearchService.addDocumentStart(userId, index, esType, page);
    }

    @AuthTokenRequired
    @RequestMapping(value = "/end", method = RequestMethod.POST)
    public Result addDocumentEnd(@RequestParam Integer userId, @RequestParam String index, @RequestParam String esType, @RequestParam String page) {
        return elasticsearchService.addDocumentEnd(userId, index, esType, page);
    }

    @RequestMapping(value = "/sumQueryTotalTimeByUserIdAndPage", method = RequestMethod.GET)
    public Result sumQueryTotalTimeByUserIdAndPage(@RequestParam Integer userId, @RequestParam String index, @RequestParam String esType, @RequestParam String page,@RequestParam String fromTime,@RequestParam String toTime) throws Exception{
        return elasticsearchService.sumQueryTotalTimeByUserIdAndPage(userId, index, esType, page,fromTime,toTime);
    }

    @RequestMapping(value = "/sumQueryTotalTimeByUserId", method = RequestMethod.GET)
    public Result sumQueryTotalTimeByUserId(@RequestParam Integer userId, @RequestParam String index, @RequestParam String esType,@RequestParam String fromTime,@RequestParam String toTime) throws Exception{
        return elasticsearchService.sumQueryTotalTimeByUserId(userId, index, esType,fromTime,toTime);
    }

    @RequestMapping(value = "/sumQueryTotalByPage", method = RequestMethod.GET)
    public Result sumQueryTotalByPage(@RequestParam String index, @RequestParam String esType, @RequestParam String page, @RequestParam String fromTime,@RequestParam String toTime) throws Exception{
        return elasticsearchService.sumQueryTotalByPage(index, esType,page,fromTime,toTime);
    }






}
