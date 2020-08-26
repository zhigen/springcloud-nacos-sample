package com.zglu.nacos.user.controller;

import com.zglu.nacos.common.api.UserApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zglu
 */
@RestController
public class UserController implements UserApi {

    @Override
    public String user() {
        return "user";
    }
}
