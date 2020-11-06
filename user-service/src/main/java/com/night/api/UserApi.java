package com.night.api;

import com.night.api.model.LoginRequest;
import com.night.api.model.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 *
 * 用户接口
 *
 * @author night
 * @date 2020-11-06
 */
public interface UserApi {
	/**
	 * 查询文件详情 接口
	 *
	 * @param var1
	 *
	 * @return
	 */
	@RequestMapping(
			value = {"/api/v1/user/login/"},
			produces = {"application/json"},
			consumes = {"application/json"},
			method = {RequestMethod.POST}
	)
	ResponseEntity<LoginResponse> queryFmDetail(@Valid @RequestBody LoginRequest var1);
}
