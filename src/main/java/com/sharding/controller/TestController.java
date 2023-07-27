package com.sharding.controller;

import com.sharding.config.ShengTengProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RefreshScope
@RestController
public class TestController {
    @Resource
    private ShengTengProperties shengTengProperties;

    @Value("${shengteng.ptid}")
    private String ptid;

    @PostMapping("hello")
    public Object ss(HttpSession httpSession, HttpServletRequest request) throws IOException {
        System.out.println("--------------");
        System.out.println(ptid);
        System.out.println("--------------");
        return httpSession.getId();
    }

}
