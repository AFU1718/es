package com.yfgz.es.bean;

/**
 * Created by LinChenwei on 2016/12/9.
 */
public class SMSCode extends BaseBean {

    public static final short CODE_TYPE_REGISTER = 0;

    private String phone;
    private Short type;
    private String code;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }
}
