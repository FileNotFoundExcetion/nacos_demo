package com.sharding.controller;

import com.sharding.config.ShengTengProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class TestController {
    @Resource
    private ShengTengProperties shengTengProperties;

    @PostMapping("hello")
    public Object ss(HttpSession httpSession, HttpServletRequest request) throws IOException {
        System.out.println("--------------");
        System.out.println(shengTengProperties.getPtid());
        System.out.println("--------------");
        return httpSession.getId();
    }

}
