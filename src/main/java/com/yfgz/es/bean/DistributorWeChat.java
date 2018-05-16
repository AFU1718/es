package com.yfgz.es.bean;

/**
 * Created by lin on 2018/3/3.
 */
public class DistributorWeChat extends BaseBean {

    private Integer distributorId;
    private Integer weChatUserId;

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }

    public Integer getWeChatUserId() {
        return weChatUserId;
    }

    public void setWeChatUserId(Integer weChatUserId) {
        this.weChatUserId = weChatUserId;
    }
}
