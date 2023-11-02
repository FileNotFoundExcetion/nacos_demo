package com.sharding.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class TAgentShardingRuleConfigDO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "sharding_key")
    private String shardingKey;
    private String shardingValue;
    private String shardingNo;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;

}
