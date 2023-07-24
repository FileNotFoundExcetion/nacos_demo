package com.sharding.controller;

import cn.hutool.core.io.IoUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

@RestController
public class TestController {
    @PostMapping("hello")
    public Object ss(HttpSession httpSession, HttpServletRequest request) throws IOException {
        String parameter = request.getParameter("p");
        Map<String, String[]> parameterMap = request.getParameterMap();
        ServletInputStream inputStream = request.getInputStream();
        System.out.println(IoUtil.read(inputStream, Charset.defaultCharset()));
        System.out.println(parameterMap);
        System.out.println(parameter);
        return httpSession.getId();
    }

}
