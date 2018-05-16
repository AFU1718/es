package com.yfgz.es.bean;

/**
 * Created by lin on 2018/3/3.
 */
public class DistributorClassify extends BaseBean {

    private Integer shopId;
    private String name;
    private double profit;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
