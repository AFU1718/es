package com.yfgz.es.bean;

/**
 * Created by lin on 2018/3/14.
 */
public class ShopProperty extends BaseBean {

//    public static final String YES = "yes";
//    public static final String NO = "no";

    public static final String IS_GOODS_AREA = "isGoodsArea";
    public static final String IS_SHOW_AREA_CLASSIFY = "isShowAreaClassify";
    public static final String HAS_TAB_BAR = "hasTabBar";

    public static final String DOUBLE = "double";
    public static final String INT = "int";
    public static final String LONG = "long";
    public static final String STRING = "string";
    public static final String BOOLEAN = "boolean";

    public static final String TRUE = "true";
    public static final String FALSE = "false";

    private String k;
    private String v;
    private String type;

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
