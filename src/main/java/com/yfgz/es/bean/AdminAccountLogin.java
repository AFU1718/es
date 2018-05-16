package com.yfgz.es.bean;

/**
 * Created by lin on 2017/8/4.
 */
public class AdminAccountLogin extends BaseBean {

    private String sid;
    private Integer accountId;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}
