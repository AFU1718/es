package com.yfgz.es.bean;


public class SubGoodsImg extends BaseBean {

    private Integer subGoodsId;
    private String url;
    private Short type;
    private Integer seq;

    public Integer getSubGoodsId() {
        return subGoodsId;
    }

    public void setSubGoodsId(Integer subGoodsId) {
        this.subGoodsId = subGoodsId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

}
