package com.yfgz.es.bean;

/**
 * Created by lin on 2018/3/3.
 */
public class DistributorRelation extends BaseBean {

    private Integer userId;
    private Integer distributorId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }
}
