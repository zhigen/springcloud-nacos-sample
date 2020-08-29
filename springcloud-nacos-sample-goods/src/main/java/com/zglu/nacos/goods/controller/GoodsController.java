package com.zglu.nacos.goods.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.zglu.nacos.common.api.GoodsApi;
import com.zglu.nacos.common.feign.UserFeign;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author zglu
 */
@RestController
public class GoodsController implements GoodsApi {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserFeign userFeign;

    @Override
    public String goods() {
        return "goods";
    }

    @Override
    public String goodsAndUser() {
        return "goods" + userFeign.user();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    @GlobalTransactional
    public int goodsAndUserAdd() {
        String sql = "insert into zglu1.goods (name, created_date, created_by, last_modified_date, last_modified_by, deleted) values (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, "seata", new Date(), 0, new Date(), 0, 0);
        userFeign.userAdd();
        return 1 / 0;
    }

    @SneakyThrows
    @Override
    @SentinelResource(value = "testSentinel", fallback = "testSentinelFallback")
    public String testSentinel() {
        Thread.sleep(2000);
        return "testSentinel";
    }

    public String testSentinelFallback(){
        return "testSentinelFallback";
    }

}
