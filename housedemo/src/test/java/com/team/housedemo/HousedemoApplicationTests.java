package com.team.housedemo;

import com.team.housedemo.domain.District;
import com.team.housedemo.domain.DistrictExample;
import com.team.housedemo.mapper.DistrictMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HousedemoApplicationTests {
    @Autowired(required = false)
    private DistrictMapper districtMapper;
    @Test
    public void contextLoads() {
        List<District> list = this.districtMapper.selectByExample(new DistrictExample());
        System.out.println("总共查询到多少行:"+list.size());
    }

}
