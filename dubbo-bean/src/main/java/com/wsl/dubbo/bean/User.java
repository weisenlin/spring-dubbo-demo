package com.wsl.dubbo.bean;

import java.io.Serializable;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/18 0018
 * 用途：
 * 描述:
 */
public class User implements Serializable{

    private String id;
    private String name;

    public User() {
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
