package com.yfgz.es.bean;

public class Layout extends BaseBean {
    private String name;
    private Integer shopId;
    private Short moduleType;
    private Short relateType;
    private Integer relateId;
    private String imgUrl;
    private String url;
    private String appId;

    private static final Short LAYOUT_IS_HOT = 1;
    private static final Short LAYOUT_IS_BANNER = 2;
    private static final Short LAYOUT_IS_HOT_CLASSIFY_GOODS = 3;
    private static final Short LAYOUT_IS_CLASSIFY = 4;

    private static final Short IS_IMG = 0;
    private static final Short IS_GOODS = 1;
    private static final Short IS_CLASSIFY = 2;
    private static final Short IS_URL = 3;
    private static final Short IS_OTHER_APP = 4;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Short getModuleType() {
        return moduleType;
    }

    public void setModuleType(Short moduleType) {
        this.moduleType = moduleType;
    }

    public Short getRelateType() {
        return relateType;
    }

    public void setRelateType(Short relateType) {
        this.relateType = relateType;
    }

    public Integer getRelateId() {
        return relateId;
    }

    public void setRelateId(Integer relateId) {
        this.relateId = relateId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
