package com.team.housedemo.service.impl;

import com.team.housedemo.domain.Type;
import com.team.housedemo.domain.TypeExample;
import com.team.housedemo.mapper.TypeMapper;
import com.team.housedemo.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired(required = false)
    private TypeMapper typeMapper;
    @Override
    public List<Type> getAllType() {
        return typeMapper.selectByExample(new TypeExample());
    }
}
