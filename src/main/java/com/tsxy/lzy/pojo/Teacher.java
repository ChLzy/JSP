package com.tsxy.lzy.pojo;

import java.io.Serializable;

public class Teacher implements Serializable {
    private Integer teaid;

    private String teaname;

    private String teasex;

    private String teapassword;

    private String teasubject;

    private String teamail;

    private String teaphoto;

    public Integer getTeaid() {
        return teaid;
    }

    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname == null ? null : teaname.trim();
    }

    public String getTeasex() {
        return teasex;
    }

    public void setTeasex(String teasex) {
        this.teasex = teasex == null ? null : teasex.trim();
    }

    public String getTeapassword() {
        return teapassword;
    }

    public void setTeapassword(String teapassword) {
        this.teapassword = teapassword == null ? null : teapassword.trim();
    }

    public String getTeasubject() {
        return teasubject;
    }

    public void setTeasubject(String teasubject) {
        this.teasubject = teasubject == null ? null : teasubject.trim();
    }

    public String getTeamail() {
        return teamail;
    }

    public void setTeamail(String teamail) {
        this.teamail = teamail == null ? null : teamail.trim();
    }

    public String getTeaphoto() {
        return teaphoto;
    }

    public void setTeaphoto(String teaphoto) {
        this.teaphoto = teaphoto == null ? null : teaphoto.trim();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaid=" + teaid +
                ", teaname='" + teaname + '\'' +
                ", teasex='" + teasex + '\'' +
                ", teapassword='" + teapassword + '\'' +
                ", teasubject='" + teasubject + '\'' +
                ", teamail='" + teamail + '\'' +
                ", teaphoto='" + teaphoto + '\'' +
                '}';
    }
}