package com.team.housedemo.controller;

import com.team.housedemo.domain.Type;
import com.team.housedemo.service.TypeService;
import com.team.housedemo.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/type/")
public class TypeController {
    @Autowired
    private TypeService typeService;
    @RequestMapping("getTypeData")
    public BaseResult getTypeData(){
        List<Type> list = typeService.getAllType();
        return new BaseResult(200,list);
    }
}
