package com.night.service.outside;

import com.night.api.FmApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author night
 * @date 2020-11-06
 */
@FeignClient("fm-service")
public interface FmServiceApi extends FmApi {
}
