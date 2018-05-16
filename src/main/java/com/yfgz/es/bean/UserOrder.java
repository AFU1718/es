package com.yfgz.es.bean;


import com.yfgz.es.utils.Random;
import org.joda.time.DateTime;

/**
 * Created by lin on 2017/8/15.
 */
public class UserOrder extends BaseBean implements BasePrice{

    //预约订单过期时间(秒)
    public static final int EXPIRES_IN = 24 * 60 * 60;


    private String num;
    private Integer userId;
    private Integer shopId;
    private Double sumPrice; //商品价格
    private String msg;
    private Double orderPrice; //订单价格
    private Double freight;//邮费
    private Double discount=0.0;//打折的金额
    private Integer priceVersion = 0;
    private String userCouponIdList;

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

   public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getPriceVersion() {
        return priceVersion;
    }

    public void setPriceVersion(Integer priceVersion) {
        this.priceVersion = priceVersion;
    }

    public String getUserCouponIdList() {
        return userCouponIdList;
    }

    public void setUserCouponIdList(String userCouponIdList) {
        this.userCouponIdList = userCouponIdList;
    }

    public static String generateOrderNum(Integer orderId, Integer shopId) {
        //生成唯一订单号(规则:userID+日期+随机数字字母)
        return (shopId + 1000)+  new DateTime().toString("yyMMddHH") + (orderId + 100000)+  Random.randomNum(2);
    }
    

    public Double obtainPrice(){
        return this.orderPrice;
    }
    public Double obtainDiscount(){return this.discount; }
}
