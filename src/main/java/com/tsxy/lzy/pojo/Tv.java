package com.tsxy.lzy.pojo;

import java.io.Serializable;

public class Tv implements Serializable {
    private Integer tvid;

    private String tvsrc;

    private Integer couid;

    public Integer getTvid() {
        return tvid;
    }

    public void setTvid(Integer tvid) {
        this.tvid = tvid;
    }

    public String getTvsrc() {
        return tvsrc;
    }

    public void setTvsrc(String tvsrc) {
        this.tvsrc = tvsrc == null ? null : tvsrc.trim();
    }

    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }
}