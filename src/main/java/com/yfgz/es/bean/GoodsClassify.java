package com.yfgz.es.bean;

public class GoodsClassify extends BaseBean {

    public static final short ABLE = 1;
    public static final short DISABLE = 0;
    public static final short DELETE = -1;

    public static final Integer orginId = 0;

    private String name;
    private Integer parentId;
    private Integer shopId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}
