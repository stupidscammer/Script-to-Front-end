package com.yotam;

import java.util.List;

/**
 * Created by yotamm on 28/04/16.
 */
public class User {
    private String name;
    private String phone;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    private List<String> friends;

    public User(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }
}
