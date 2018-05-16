package com.yfgz.es.bean;



public class Goods extends BaseBean {
    public static final Short DELETE = -1;
    public static final Short ON_SALE = 1;
    public static final Short OFF_SALE = 0;

    public static final short TYPE_GOODS = 2;
    public static final short TYPE_MATERIAL = 1;

    private String name;
    private Integer classifyId;
    private Integer shopId;
    private Short type;
    private Short isHot;
    private Short isClassifyHot;
    private Short isBanner;
    private Integer seq;
    private Integer fakeSales;
    private String brief;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getIsHot() {
        return isHot;
    }

    public void setIsHot(Short isHot) {
        this.isHot = isHot;
    }

    public Short getIsClassifyHot() {
        return isClassifyHot;
    }

    public void setIsClassifyHot(Short isClassifyHot) {
        this.isClassifyHot = isClassifyHot;
    }

    public Short getIsBanner() {
        return isBanner;
    }

    public void setIsBanner(Short isBanner) {
        this.isBanner = isBanner;
    }

    public Integer getFakeSales() {
        return fakeSales;
    }

    public void setFakeSales(Integer fakeSales) {
        this.fakeSales = fakeSales;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }
    

}
