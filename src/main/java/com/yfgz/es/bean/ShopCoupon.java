package com.yfgz.es.bean;

import java.sql.Timestamp;

public class ShopCoupon extends BaseBean {

    //receivable 取值
    public static final Short COUPON_RECEIVABLE = 1;//可领
    public static final Short COUPON_UNRECEIVABLE = 0;//不可领
    //subjectType 取值
    public static final Short SHOPCOUPON_OLD_CUSTOMERS_ONLY = 1;//仅老客户
    public static final Short SHOPCOUPON_NEW_CUSTOMERS_ONLY = 2;//仅新客户
    public static final Short SHOPCOUPON_ALL_CUSTOMERS = 3;//全部客户


    private Integer shopId;
    private String couponName;
    private Timestamp beginTime;
    private Timestamp expireTime;//单位：天
    private Short subjectType;
    private Integer total;
    private Integer leftover;
    private Integer numLimit;

    private Short usageType = 1;
    private Double upTo;
    private Double minus;

    private Double discount = 0.00;

    private String description;
    private Short reusable;//1 可重用 0 不可重用
    private Short receivable = 1;
    private Integer version = 0;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    public Short getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(Short subjectType) {
        this.subjectType = subjectType;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getLeftover() {
        return leftover;
    }

    public void setLeftover(Integer leftover) {
        this.leftover = leftover;
    }

    public Integer getNumLimit() {
        return numLimit;
    }

    public void setNumLimit(Integer numLimit) {
        this.numLimit = numLimit;
    }

    public Short getUsageType() {
        return usageType;
    }

    public void setUsageType(Short usageType) {
        this.usageType = usageType;
    }

    public Double getUpTo() {
        return upTo;
    }

    public void setUpTo(Double upTo) {
        this.upTo = upTo;
    }

    public Double getMinus() {
        return minus;
    }

    public void setMinus(Double minus) {
        this.minus = minus;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getReusable() {
        return reusable;
    }

    public void setReusable(Short reusable) {
        this.reusable = reusable;
    }

    public Short getReceivable() {
        return receivable;
    }

    public void setReceivable(Short receivable) {
        this.receivable = receivable;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
