package com.team.housedemo.service;

import com.team.housedemo.domain.Users;

public interface UserService {

    //注册
    public Integer regUser(Users users);


    //登入
    public Users login(String userName,String password);
}
