package com.zglu.nacos.app;

import com.zglu.nacos.common.feign.GoodsFeign;
import com.zglu.nacos.common.feign.UserFeign;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zglu
 */
@Log4j2
@RestController
public class TestController {
    @Autowired
    private GoodsFeign goodsFeign;
    @Autowired
    private UserFeign userFeign;

    @GetMapping
    public void test() {
        log.info(goodsFeign.goods());
        log.info(goodsFeign.goodsAndUser());
        log.info(userFeign.user());
        log.info(userFeign.defaultUser());
        log.info(userFeign.userAdd());
        log.info(goodsFeign.goodsAndUserAdd());
    }
}
