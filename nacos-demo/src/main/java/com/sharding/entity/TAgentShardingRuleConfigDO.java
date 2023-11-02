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
    /**
     * 列名: id
     * 备注: 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * 列名: sharding_key
     * 备注: 旺铺内部商户号
     */
    @Column(name = "sharding_key")
    private String shardingKey;

    /**
     * 列名: agent_no
     * 备注: 代理id
     */

    private String shardingValue;


    /**
     * 列名: agent_tree
     * 备注: 代理tree
     */

    private String shardingNo;

    /**
     * 列名:
     * 备注:
     */

    private String createUser;


    /**
     * 列名: create_time
     * 备注: 创建时间
     */

    private Date createTime;

    /**
     * 列名:
     * 备注:
     */

    private String updateUser;

    /**
     * 列名: update_time
     * 备注: 更新时间
     */

    private Date updateTime;

}
