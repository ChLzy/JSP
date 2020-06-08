package com.tsxy.lzy.pojo;

import java.io.Serializable;

public class Everyone implements Serializable {
    private String account;

    private String type;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    public String toString() {
        return "Everyone{" +
                "account='" + account + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}