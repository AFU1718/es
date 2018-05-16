package com.yfgz.es.bean;

/**
 * Created by lin on 2017/8/24.
 */
public class CartOrderGoods extends BaseBean {

    private Integer cartOrderId;
    private Integer cartGoodsId;
    private Integer subGoodsId;
    private Integer count;

    public Integer getCartOrderId() {
        return cartOrderId;
    }

    public void setCartOrderId(Integer cartOrderId) {
        this.cartOrderId = cartOrderId;
    }

    public Integer getCartGoodsId() {
        return cartGoodsId;
    }

    public void setCartGoodsId(Integer cartGoodsId) {
        this.cartGoodsId = cartGoodsId;
    }

    public Integer getSubGoodsId() {
        return subGoodsId;
    }

    public void setSubGoodsId(Integer subGoodsId) {
        this.subGoodsId = subGoodsId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
