package com.sharding.test;

import com.sharding.TestApplication;
import com.sharding.config.ShengTengProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class DemoTest {

    @Resource
    private ShengTengProperties shengTengProperties;

    @Test
    public void test001(){
        System.out.println("--------------");
        System.out.println(shengTengProperties.getPtid());
        System.out.println("--------------");
    }
}
