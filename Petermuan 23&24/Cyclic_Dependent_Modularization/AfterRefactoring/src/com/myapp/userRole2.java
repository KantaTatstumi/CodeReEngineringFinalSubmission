package com.myapp;

public class userRole2 {

    private User user;
    private Role role;
    public userRole2(User user, Role role)
    {
        this.user = user;
        this.role = role;

    }
    public User getUser(){
        return user;

    }
    public Role getRole(){
        return role;
    }

}