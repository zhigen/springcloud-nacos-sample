package com.zglu.nacos.user.controller;

import com.zglu.nacos.common.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author zglu
 */
@RestController
public class UserController implements UserApi {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String user() {
        return "user";
    }

    @Override
    public int userAdd() {
        String sql = "insert into zglu0.user (name, created_date, created_by, last_modified_date, last_modified_by, deleted) values (?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, "seata", new Date(), 0, new Date(), 0, 0);
    }
}
