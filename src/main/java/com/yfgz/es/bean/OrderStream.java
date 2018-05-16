package com.yfgz.es.bean;

public class OrderStream extends BaseBean {

    public static final short INIT_TYPE = 0;
    public static final short PREPAY_TYPE = 1;
    public static final short PAY_TYPE = 2;
    public static final short SENT_TYPE = 3;
    public static final short CUSTOM_CONFIRM_TYPE = 4;
    public static final short COMPLETED_TYPE = 5;
    
    public static final short APPLY_REFUND = 6;
    
    public static final short REFUND_SUCCESS = 7;
    
    public static final short REFUND_FAIL = 8;

    public static final short CLOSED_TYPE =-1;

    private Integer orderId;
    private Short type;
    private String msg;
    private String operator;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
