package com.tsxy.lzy.pojo;

import java.io.Serializable;

public class Course implements Serializable {
    private Integer couid;

    private String couname;

    private String coushow;

    private Integer teaid;

    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }

    public String getCouname() {
        return couname;
    }

    public void setCouname(String couname) {
        this.couname = couname == null ? null : couname.trim();
    }

    public String getCoushow() {
        return coushow;
    }

    public void setCoushow(String coushow) {
        this.coushow = coushow == null ? null : coushow.trim();
    }

    public Integer getTeaid() {
        return teaid;
    }

    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }
}