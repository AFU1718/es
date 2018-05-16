package com.yfgz.es.bean;

/**
 * Created by lin on 2018/4/12.
 */
public class ActivityClassify extends BaseBean {

    private Integer shopId;
    private String name;
    private String imgUrl;

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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
