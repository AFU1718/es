package com.yfgz.es.bean;


/**
 * Created by lin on 2017/8/15.
 */
public class OrderGoods extends BaseBean {

    private Integer userId;
    private Integer shopId;
    private Integer orderId;
    private Integer subGoodsId;
    private Integer goodsId;
    private Integer count;
    private Double price;

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSubGoodsId() {
        return subGoodsId;
    }

    public void setSubGoodsId(Integer subGoodsId) {
        this.subGoodsId = subGoodsId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    

}
