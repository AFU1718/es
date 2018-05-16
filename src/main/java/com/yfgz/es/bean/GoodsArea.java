package com.yfgz.es.bean;

/**
 * Created by lin on 2018/3/24.
 */
public class GoodsArea extends BaseBean {

    private String province;
    private String city;
    private String area;
    private Long proCode;
    private Long cityCode;
    private Long areaCode;

    private Integer goodsId;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Long getProCode() {
        return proCode;
    }

    public void setProCode(Long proCode) {
        this.proCode = proCode;
    }

    public Long getCityCode() {
        return cityCode;
    }

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public Long getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Long areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}
