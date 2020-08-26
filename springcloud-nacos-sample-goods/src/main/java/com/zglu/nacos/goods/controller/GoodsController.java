package com.zglu.nacos.goods.controller;

import com.zglu.nacos.common.api.GoodsApi;
import com.zglu.nacos.common.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zglu
 */
@RestController
public class GoodsController implements GoodsApi {
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
}
