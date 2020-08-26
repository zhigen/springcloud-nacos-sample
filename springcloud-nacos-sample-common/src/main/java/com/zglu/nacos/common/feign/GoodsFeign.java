package com.zglu.nacos.common.feign;

import com.zglu.nacos.common.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zglu
 */
@FeignClient("goods")
public interface GoodsFeign extends GoodsApi {
}
