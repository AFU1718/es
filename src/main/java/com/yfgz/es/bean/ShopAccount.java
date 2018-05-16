package com.yfgz.es.bean;

/**
 * Created by lin on 2017/8/4.
 */
public class ShopAccount extends BaseBean implements ILogin {

    private String account;
    private String password;
    private Integer shopId;

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

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}
