package com.yfgz.es.bean;

/**
 * Created by lin on 2018/3/13.
 */
public class Settings extends BaseBean {

    public static final String VERSION_KEY = "version";
    public static final String BOTTOM_LINK_KEY = "bottomLink";
    public static final String BOTTOM_LINK_NAME_KEY = "bottomLinkName";

    private String k;
    private String v;

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
}
