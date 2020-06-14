package com.team.housedemo.controller;

import com.team.housedemo.domain.District;
import com.team.housedemo.service.DistrictService;
import com.team.housedemo.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/district/")
public class DistrictController {
    @Autowired
    private DistrictService districtService;
    @RequestMapping("getDistrictData")
    private BaseResult getDistrictData(){
        List<District> list = districtService.getDistrictData();
        return new BaseResult(200,list);
    }
}
