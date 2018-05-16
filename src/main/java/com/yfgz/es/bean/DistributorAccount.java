package com.yfgz.es.bean;

/**
 * Created by lin on 2018/3/3.
 */
public class DistributorAccount extends BaseBean {

    private String account;
    private String password;
    private Integer distributorId;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Integer distributorId) {
        this.distributorId = distributorId;
    }
}
