package com.yfgz.es.bean;


/**
 * Created by lin on 2017/7/9.
 */
public class UploadFile extends BaseBean {

    private String path;
    private Long size;
    private String url;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
