package com.night.controller;

import com.night.api.UserApi;
import com.night.api.model.FmRequest;
import com.night.api.model.LoginRequest;
import com.night.api.model.LoginResponse;
import com.night.service.outside.FmServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author night
 * @date 2020-11-06
 */
@RestController
public class UserController implements UserApi {
	@Autowired
	private FmServiceApi fmService;
	@Override
	public ResponseEntity<LoginResponse> queryFmDetail(@Valid @RequestBody LoginRequest request) {

		// 就简单的获取账号密码 调用fm 服务中的 queryFmDetail
		String userName = request.getUserName();
		String password = request.getPassword();

		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setCode(userName + password + fmService.queryFmDetail(new FmRequest("userService")).getBody().getFmStr());

		return ResponseEntity.ok(loginResponse);
	}
}
