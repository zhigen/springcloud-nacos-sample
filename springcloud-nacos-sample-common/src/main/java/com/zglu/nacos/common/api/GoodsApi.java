package com.zglu.nacos.common.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author zglu
 */
public interface GoodsApi {
    /**
     * goods
     *
     * @return String
     */
    @GetMapping("/goods")
    String goods();

    /**
     * goodsAndUser
     *
     * @return String
     */
    @GetMapping("/goodsAndUser")
    String goodsAndUser();

    /**
     * goodsAndUserAdd
     *
     * @return int
     */
    @PostMapping("/goodsAndUserAdd")
    int goodsAndUserAdd();
}
