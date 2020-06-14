package com.team.housedemo.controller;

import com.team.housedemo.domain.Users;
import com.team.housedemo.service.UserService;
import com.team.housedemo.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("regUser")
    private BaseResult regUser(Users users){
    Integer temp = userService.regUser(users);
        if (temp>0)
           return new BaseResult(BaseResult.RESULT_SUCCESS,"");
        else
           return new BaseResult(BaseResult.RESULT_FAIL,"系统维护中...");
    }
    @RequestMapping("userLogin")
    private BaseResult userLogin(String username, String password, HttpSession session){
        Users login = userService.login(username, password);
        if (login==null){
            return new BaseResult(BaseResult.RESULT_FAIL,"");
        }
        else{
            session.setAttribute("loginInfo",login);
            session.setMaxInactiveInterval(6000);
            return new BaseResult(BaseResult.RESULT_SUCCESS,"");
        }

    }
}
