package com.team.housedemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.housedemo.domain.House;
import com.team.housedemo.mapper.HouseMapper;
import com.team.housedemo.service.HouseService;
import com.team.housedemo.util.Condition;
import com.team.housedemo.util.PageParmeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired(required =false)
    private HouseMapper houseMapper;

    @Override
    public Integer addHouse(House house) {
        return houseMapper.insertSelective(house);
    }

    @Override
    public PageInfo<House> getHouseByUser(Integer userid, PageParmeter pageParmeter) {
        //开启分页
        PageHelper.startPage(pageParmeter.getPage(),pageParmeter.getPageSize());
        //调用dao层查询所有
        List<House> list=this.houseMapper.getHouseInfoByUser(userid);
        return new PageInfo<House>(list);
    }

    @Override
    public Integer delHouse(String id, Integer delState) {
        House house=new House();
        house.setId(id);
        house.setIsdel(delState);
        return this.houseMapper.updateByPrimaryKeySelective(house);
    }

    @Override
    public Integer updateHouseInfo(Integer userid) {
        return this.houseMapper.updateHouseInfo(userid);
    }

    @Override
    public PageInfo<House> getHouseInfoByCondition(Condition condition) {
        PageHelper.startPage(condition.getPage(),condition.getPageSize());
        List<House> list = this.houseMapper.getHouseInfoByCondition(condition);
        return new PageInfo<House>(list);
    }
}
