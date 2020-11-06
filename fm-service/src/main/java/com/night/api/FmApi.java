package com.night.api;

import com.night.api.model.FmRequest;
import com.night.api.model.FmResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 *
 * 文件接口
 *
 * @author night
 * @date 2020-11-06
 */
public interface FmApi {
	/**
	 * 查询文件详情 接口
	 *
	 * @param request
	 *
	 * @return
	 */
	@RequestMapping(
			value = {"/api/v1/fm/detail/"},
			produces = {"application/json"},
			consumes = {"application/json"},
			method = {RequestMethod.POST}
	)
	ResponseEntity<FmResponse> queryFmDetail(@Valid @RequestBody FmRequest request);
}
