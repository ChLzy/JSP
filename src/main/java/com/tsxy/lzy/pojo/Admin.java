package com.tsxy.lzy.pojo;

import java.io.Serializable;

public class Admin implements Serializable {
    private Integer adid;

    private String adname;

    private String adpassword;

    private String adphone;

    private String admail;

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname == null ? null : adname.trim();
    }

    public String getadpassword() {
        return adpassword;
    }

    public void setadpassword(String adpassword) {
        this.adpassword = adpassword == null ? null : adpassword.trim();
    }

    public String getAdphone() {
        return adphone;
    }

    public void setAdphone(String adphone) {
        this.adphone = adphone == null ? null : adphone.trim();
    }

    public String getAdmail() {
        return admail;
    }

    public void setAdmail(String admail) {
        this.admail = admail == null ? null : admail.trim();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adid=" + adid +
                ", adname='" + adname + '\'' +
                ", adpassword='" + adpassword + '\'' +
                ", adphone='" + adphone + '\'' +
                ", admail='" + admail + '\'' +
                '}';
    }
}
