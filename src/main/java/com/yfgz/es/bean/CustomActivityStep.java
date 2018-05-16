package com.yfgz.es.bean;

/**
 * Created by lin on 2018/4/12.
 */
public class CustomActivityStep extends BaseBean {
    //status取值
    public static final Short NONPASS=1;
    public static final Short PASS=2;
    private Integer activityId;
    private Integer locationId;
    private String remarks;
    private String imgUrl;
    private Integer userId;
    private Integer activityStepId;
    private Short seq;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Short getSeq() {
        return seq;
    }

    public void setSeq(Short seq) {
        this.seq = seq;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getActivityStepId() {
        return activityStepId;
    }

    public void setActivityStepId(Integer activityStepId) {
        this.activityStepId = activityStepId;
    }
}
