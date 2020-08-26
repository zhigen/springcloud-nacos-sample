package com.zglu.nacos.common.api;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zglu
 */
public interface UserApi {
    /**
     * user
     *
     * @return String
     */
    @GetMapping("/user")
    String user();

    /**
     * defaultUser
     *
     * @return String
     */
    @GetMapping("/defaultUser")
    default String defaultUser() {
        return "default user";
    }
}
