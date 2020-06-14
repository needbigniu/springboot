package com.team.housedemo.service.impl;

import com.team.housedemo.domain.District;
import com.team.housedemo.domain.DistrictExample;
import com.team.housedemo.mapper.DistrictMapper;
import com.team.housedemo.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired(required = false)
    private DistrictMapper districtMapper;
    @Override
    public List<District> getDistrictData() {
        List<District> list = districtMapper.selectByExample(new DistrictExample());
        return list;
    }
}
