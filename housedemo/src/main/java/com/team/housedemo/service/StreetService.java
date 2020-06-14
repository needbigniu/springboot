package com.team.housedemo.service;

import com.team.housedemo.domain.Street;

import java.util.List;

public interface StreetService {
    //通过区域id获取街道信息
    public List<Street> getStreetData(Integer did);
 }
