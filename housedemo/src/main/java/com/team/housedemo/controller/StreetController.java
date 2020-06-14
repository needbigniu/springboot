package com.team.housedemo.controller;

import com.team.housedemo.domain.Street;
import com.team.housedemo.service.StreetService;
import com.team.housedemo.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/street/")
public class StreetController {
    @Autowired
    private StreetService streetService;
    @RequestMapping("getStreetData")
    private BaseResult getStreetData(Integer did){
        List<Street> list = streetService.getStreetData(did);
        return new BaseResult(200,list);
    }

}
