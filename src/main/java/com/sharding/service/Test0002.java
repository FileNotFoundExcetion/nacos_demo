package com.sharding.service;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;

import java.time.LocalDate;
import java.util.Date;

public class Test0002 {
    public static void main(String[] args) {
        Date begin = cn.hutool.core.date.DateUtil.parse("2023-01-01");
        Date end = cn.hutool.core.date.DateUtil.parse("2023-12-31");
        long l = DateUtil.between(begin, new Date(), DateUnit.DAY,true);
        long l1 = DateUtil.between(begin, end, DateUnit.DAY,true);
        System.out.println(l);
        System.out.println(l1);
        LocalDate target = LocalDate.parse("2023-01-01");
        LocalDate today = LocalDate.parse("2023-12-31");
        System.out.println("today : " + today);
        System.out.println("target: " + target);
        long days = Math.abs(target.toEpochDay() - today.toEpochDay());
        System.out.println("------相差-------:" + days + "天");

        LocalDate target1 = LocalDate.parse("2023-01-01");
        LocalDate today1 = LocalDate.parse("2023-06-30");
        System.out.println("today : " + today);
        System.out.println("target: " + target);
        long days1 = Math.abs(target1.toEpochDay() - today1.toEpochDay());
        System.out.println("======相差======:" + days1 + "天");
    }
}
