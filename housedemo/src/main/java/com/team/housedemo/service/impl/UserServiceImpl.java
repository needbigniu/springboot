package com.team.housedemo.service.impl;

import com.team.housedemo.domain.Users;
import com.team.housedemo.domain.UsersExample;
import com.team.housedemo.mapper.UsersMapper;
import com.team.housedemo.service.UserService;
import com.team.housedemo.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UsersMapper usersMapper;
    @Override
    public Integer regUser(Users users) {
        users.setPassword(MD5Utils.md5Encrypt(users.getPassword()));
        return usersMapper.insertSelective(users);
    }

    @Override
    public Users login(String userName, String password) {
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andNameEqualTo(userName);
        criteria.andPasswordEqualTo(MD5Utils.md5Encrypt(password));
        List<Users> list = usersMapper.selectByExample(usersExample);
        if (list!=null&&list.size()==1){
            return list.get(0);
        }
        return null;
    }
}
