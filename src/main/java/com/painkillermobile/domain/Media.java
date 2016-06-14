package com.painkillermobile.domain;

public class Media {

    private Integer id;
    private Integer contentType;
    private String url;
    private byte[] content;
    private Long size;
    private byte[] md5;

    public Media() {
    }

    public Media(Integer contentType, String url, byte[] content, Long size, byte[] md5) {
        this.contentType = contentType;
        this.url = url;
        this.content = content;
        this.size = size;
        this.md5 = md5;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public byte[] getMd5() {
        return md5;
    }

    public void setMd5(byte[] md5) {
        this.md5 = md5;
    }
}