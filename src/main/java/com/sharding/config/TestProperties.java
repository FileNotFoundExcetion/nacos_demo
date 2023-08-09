package com.sharding.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "test")
public class TestProperties {

   private Integer type=0;

    private Integer type1=1;

    private Integer type2=2;

}
