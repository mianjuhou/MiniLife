package com.fangdean.goodsserver.model;

public class ResponseBean<T> {

    private T content;

    private int code;

    private String msg;

    public ResponseBean() {
    }

    public ResponseBean(T content, int code, String msg) {
        this.content = content;
        this.code = code;
        this.msg = msg;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}