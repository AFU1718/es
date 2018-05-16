package com.yfgz.es.bean;

/**
 * Created by lin on 2018/4/12.
 */
public class Location extends BaseBean {

    private String name;
    private Double longitude;//经度
    private Double latitude;//纬度

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
