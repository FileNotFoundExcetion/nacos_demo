package com.sharding.service;

import com.sharding.config.TestProperties;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TestService01 implements TestService{
    @Resource
    private TestProperties testProperties;
    @Override
    public Integer type() {
        return testProperties.getType();
    }
}
