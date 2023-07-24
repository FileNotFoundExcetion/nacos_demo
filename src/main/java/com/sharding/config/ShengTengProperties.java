package com.sharding.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "shengteng")
public class ShengTengProperties {

    private String shengTengUrl="https://open.gateway.cpay-service.com/common/v1/print/push";

    private String ptid="";

    private String cid="CPAYIOT_WANGYI";

    private String appSecert="FvMTTTYC9BD9LFFTOQQpLMAzNq0vn0VO32H2f5q7gwI=";

}
