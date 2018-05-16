package com.yfgz.es.bean;

import java.sql.Timestamp;

public class UserCoupon extends BaseBean {

    //status
    public static final short USABLE = 1;
    public static final short USED = 2;//已使用
    public static final short EXPIRED = 3;//已过期，不提现在数据库

    //usageType 取值
    public static final short COUPON_UPTOMINUS = 1;//满减
    public static final short COUPON_DISCOUNT = 2;//打几折

    private Integer userId;
    private Integer shopId;
    private String couponName;
    private Timestamp beginTime;
    private Timestamp expireTime;
    private Short usageType;//类型
    private Double upTo;
    private Double minus;
    private Double discount;
    private String description;
    private Short reusable;//1 可重用 0 不可重用
    private Integer shopCouponId;

    public static UserCoupon createUserCoupon(Integer userId, ShopCoupon shopCoupon) {
        UserCoupon userCoupon = new UserCoupon();
        userCoupon.setUserId(userId);
        userCoupon.setShopId(shopCoupon.getShopId());
        userCoupon.setCouponName(shopCoupon.getCouponName());
        userCoupon.setBeginTime(shopCoupon.getBeginTime());
        userCoupon.setExpireTime(shopCoupon.getExpireTime());
        userCoupon.setUsageType(shopCoupon.getUsageType());
        userCoupon.setUpTo(shopCoupon.getUpTo());
        userCoupon.setMinus(shopCoupon.getMinus());
        userCoupon.setDiscount(shopCoupon.getDiscount());
        userCoupon.setDescription(shopCoupon.getDescription());
        userCoupon.setReusable(shopCoupon.getReusable());
        userCoupon.setShopCouponId(shopCoupon.getId());
        return userCoupon;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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

    public Integer getShopCouponId() {
        return shopCouponId;
    }

    public void setShopCouponId(Integer shopCouponId) {
        this.shopCouponId = shopCouponId;
    }

    public Double discount(Double price) {
        if (usageType == COUPON_UPTOMINUS) {
            if (price > minus) {
                return minus;
            } else {
                return price - 0.01;
            }
        } else if (usageType == COUPON_DISCOUNT) {
            return price * (1 - discount);
        }
        return 0.0;
    }
}
