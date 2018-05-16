package com.yfgz.es.bean;

/**
 * Created by lin on 2018/4/13.
 */
public class CustomActivity extends BaseBean {
    //status 取值
    public static short UNSUBMIT = 1;
    public static short COMPLETED = 2;
    public static short SUBMIT = 4;
    public static short DENIED = -1;

    //joined 取值
    public static short JOINED = 1;

    private Integer activityId;
    private Integer userId;
    private Short joined = 0;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Short getJoined() {
        return joined;
    }

    public void setJoined(Short joined) {
        this.joined = joined;
    }
}
