package com.zglu.nacos.common.api;

import org.springframework.web.bind.annotation.GetMapping;

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
}
