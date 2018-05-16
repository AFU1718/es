package com.yfgz.es.bean;



public class SubGoods extends BaseBean {
    public static final short defaultType = 1;

    public static final short AVAILABLE = 1;
    public static final short UNAVAILABLE = 2;
    public static final short DELETE = -1;

    private String mainSpec;
    private String subSpec;
    private Integer parentId;
    private Short type;
    private Double price;
    private Integer stock;
    private Integer seq;
    private Integer sales;
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getMainSpec() {
        return mainSpec;
    }

    public void setMainSpec(String mainSpec) {
        this.mainSpec = mainSpec;
    }

    public String getSubSpec() {
        return subSpec;
    }

    public void setSubSpec(String subSpec) {
        this.subSpec = subSpec;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }
    


}
