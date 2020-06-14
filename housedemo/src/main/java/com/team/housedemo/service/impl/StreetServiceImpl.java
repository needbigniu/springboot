package com.team.housedemo.service.impl;

import com.team.housedemo.domain.Street;
import com.team.housedemo.domain.StreetExample;
import com.team.housedemo.mapper.StreetMapper;
import com.team.housedemo.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StreetServiceImpl implements StreetService {
    @Autowired(required = false)
    private StreetMapper streetMapper;

    @Override
    public List<Street> getStreetData(Integer did) {
        StreetExample streetExample=new StreetExample();
        StreetExample.Criteria criteria = streetExample.createCriteria();
        criteria.andDistrictIdEqualTo(did);
        List<Street> list = streetMapper.selectByExample(streetExample);
        return list;
    }
}
