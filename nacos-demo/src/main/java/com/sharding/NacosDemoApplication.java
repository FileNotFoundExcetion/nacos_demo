package com.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan(basePackages = {"com.sharding.mapper"})
@SpringBootApplication
public class NacosDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDemoApplication.class, args);
    }

}
