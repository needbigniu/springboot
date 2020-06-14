package com.team.housedemo.util;

public class Condition extends PageParmeter{
    private String title;//标题
    private Integer did;//区id
    private Integer sid;//街道id
    private Integer tid;//类型id
    private Long startSize;//开始价格
    private Long endSize;//结束价格

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Long getStartSize() {
        return startSize;
    }

    public void setStartSize(Long startSize) {
        this.startSize = startSize;
    }

    public Long getEndSize() {
        return endSize;
    }

    public void setEndSize(Long endSize) {
        this.endSize = endSize;
    }
}
