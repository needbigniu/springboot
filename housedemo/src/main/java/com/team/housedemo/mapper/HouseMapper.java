package com.team.housedemo.mapper;

import com.team.housedemo.domain.House;
import com.team.housedemo.domain.HouseExample;
import com.team.housedemo.util.Condition;

import java.util.List;

public interface HouseMapper {
    int deleteByPrimaryKey(String id);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    //通过用户id查询房子信息
    public List<House> getHouseInfoByUser(Integer id);
    //回复用户数据
    public Integer updateHouseInfo(Integer id);
    //条件查询
    public List<House> getHouseInfoByCondition(Condition condition);
}