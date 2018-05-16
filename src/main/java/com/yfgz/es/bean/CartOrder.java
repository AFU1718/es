package com.yfgz.es.bean;

/**
 * Created by lin on 2017/8/24.
 *
 * 购物车到提交订单页面的数据
 */
public class CartOrder extends BaseBean{

    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
