package com.night.api.model;

import lombok.Data;

/**
 * 用户登录请求
 *
 * @author night
 * @date 2020-11-06
 */
@Data
public class LoginRequest {
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 登录密码
	 */
	private String password;
}
