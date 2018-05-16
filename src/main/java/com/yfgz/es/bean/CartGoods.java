package com.yfgz.es.bean;

/**
 * Created by lin on 2017/8/15.
 */
public class CartGoods extends BaseBean {

    private Integer userId;
    private Integer shopId;
    private Integer subGoodsId;
    private Integer goodsId;
    private Integer count;

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
}
