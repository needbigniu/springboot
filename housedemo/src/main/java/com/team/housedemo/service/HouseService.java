package com.team.housedemo.service;

import com.github.pagehelper.PageInfo;
import com.team.housedemo.domain.House;
import com.team.housedemo.util.Condition;
import com.team.housedemo.util.PageParmeter;

import java.util.List;

public interface HouseService {
    //发布房屋信息
    public Integer addHouse(House house);
    //通过用户id查询房屋信息
    public PageInfo<House> getHouseByUser(Integer userid, PageParmeter pageParmeter);
    //逻辑删除信息
    public Integer delHouse(String id ,Integer delState);
    //恢复逻辑删除数据
    public Integer updateHouseInfo(Integer userid);
    //条件分页查询
    public PageInfo<House> getHouseInfoByCondition(Condition condition);
}
