package com.yfgz.es.bean;

public class Freight extends BaseBean {

    public static final short INDEPENDENT = 1;
    public static final short NOT_INDEPENDENT = 0;

    //type
    public static final short SPECIAL_AREA = 1;
    public static final short DEFAULT_AREA = 0;

    private Integer goodsId;
    private Double price;
    private Short independent;
    private Integer limitCount;//为0时不限制个数，大于0时每limitCount个收一次快递费
    private Short type;
    private String province;//type为1时有效
    private String city;
    private String district;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Short getIndependent() {
        return independent;
    }

    public void setIndependent(Short independent) {
        this.independent = independent;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
