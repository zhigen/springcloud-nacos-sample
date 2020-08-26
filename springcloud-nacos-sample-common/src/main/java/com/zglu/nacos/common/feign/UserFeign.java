package com.zglu.nacos.common.feign;

import com.zglu.nacos.common.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zglu
 */
@FeignClient("user")
public interface UserFeign extends UserApi {
}
