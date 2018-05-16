package com.yfgz.es.bean;

public class ShopSettings extends BaseBean{

    private Integer shopId;
    private String appId;
    private String appSecret;
    private String mch_id;
    private String wxKey;
    private Integer cert_path_id;
    private Short customService;
    private String bottomLink;
    private String bottomLinkName;
    private String bottomImgUrl;



    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getWxKey() {
        return wxKey;
    }

    public void setWxKey(String wxKey) {
        this.wxKey = wxKey;
    }

	public Integer getCert_path_id() {
		return cert_path_id;
	}

	public void setCert_path_id(Integer cert_path_id) {
		this.cert_path_id = cert_path_id;
	}

    public Short getCustomService() {
        return customService;
    }

    public void setCustomService(Short customService) {
        this.customService = customService;
    }

    public String getBottomLink() {
        return bottomLink;
    }

    public void setBottomLink(String bottomLink) {
        this.bottomLink = bottomLink;
    }

    public String getBottomLinkName() {
        return bottomLinkName;
    }

    public void setBottomLinkName(String bottomLinkName) {
        this.bottomLinkName = bottomLinkName;
    }

    public String getBottomImgUrl() {
        return bottomImgUrl;
    }

    public void setBottomImgUrl(String bottomImgUrl) {
        this.bottomImgUrl = bottomImgUrl;
    }
}
