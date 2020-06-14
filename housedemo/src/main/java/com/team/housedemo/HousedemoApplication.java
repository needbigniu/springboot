package com.team.housedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(value = "com.team.housedemo.mapper")
@ServletComponentScan("com.team.housedemo.filter")
public class HousedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HousedemoApplication.class, args);
    }

}
