package com.tsxy.lzy.pojo;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer stuid;

    private String stuname;

    private String stusex;

    private String stupassword;

    private String stuphoto;

    private String stumail;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex == null ? null : stusex.trim();
    }

    public String getStupassword() {
        return stupassword;
    }

    public void setStupassword(String stupassword) {
        this.stupassword = stupassword == null ? null : stupassword.trim();
    }

    public String getStuphoto() {
        return stuphoto;
    }

    public void setStuphoto(String stuphoto) {
        this.stuphoto = stuphoto == null ? null : stuphoto.trim();
    }

    public String getStumail() {
        return stumail;
    }

    public void setStumail(String stumail) {
        this.stumail = stumail == null ? null : stumail.trim();
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stusex='" + stusex + '\'' +
                ", stupassword='" + stupassword + '\'' +
                ", stuphoto='" + stuphoto + '\'' +
                ", stumail='" + stumail + '\'' +
                '}';
    }
}