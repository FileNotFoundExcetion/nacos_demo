package com.sharding.service;

import com.sharding.entity.TAgentShardingRuleConfigDO;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class Test0003 {
    public static void main(String[] args) throws IllegalAccessException {
        TAgentShardingRuleConfigDO tAgentShardingRuleConfigDO=new TAgentShardingRuleConfigDO();
        tAgentShardingRuleConfigDO.setShardingNo("123");
        Type genericSuperclass = tAgentShardingRuleConfigDO.getClass().getGenericSuperclass();
        System.out.println(genericSuperclass);
        Field[] declaredFields = tAgentShardingRuleConfigDO.getClass().getDeclaredFields();
        for (Field f:declaredFields){
            f.setAccessible(true);
            Type genericType = f.getGenericType();
            System.out.println(genericType.getClass());
            System.out.println(f.getName());
            Object o = f.get(tAgentShardingRuleConfigDO);
            System.out.println(o);
        }
    }
}
