package com.yfgz.es.bean;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by lin on 2017/6/16.
 */
public class BaseBean implements Serializable {

    public static final short AVAILABLE = 1;
    public static final short UNAVAILABLE = 0;

    private Integer id;
    private Short status = 1;
    private Timestamp updatedAt;
    private Timestamp createdAt;

    public BaseBean() {
        Timestamp date = new Timestamp(System.currentTimeMillis());
        updatedAt = date;
        createdAt = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
