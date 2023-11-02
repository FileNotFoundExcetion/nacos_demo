package com.sharding.controller;

import com.sharding.service.TestService001;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

@RefreshScope
@RestController
public class TestController {
    @Resource
    private TestService001 testService001;

    @PostMapping("hello")
    public Object ss(@RequestParam String type) throws IOException {
        return "hello world";
    }

}
