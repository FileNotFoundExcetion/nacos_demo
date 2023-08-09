package com.sharding.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class TestService001 implements InitializingBean {
    public Map<Integer,TestService> map=new ConcurrentHashMap<>();

    @Resource
    private ApplicationContext applicationContext;
    @Override
    public void afterPropertiesSet() throws Exception {
        applicationContext.getBeansOfType(TestService.class)
                .values().forEach(result -> map.put(result.type(),result));
    }
}
