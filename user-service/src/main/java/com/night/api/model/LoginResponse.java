package com.night.api.model;

import lombok.Data;

/**
 * 用户登录返回
 *
 * @author night
 * @date 2020-11-06
 */
@Data
public class LoginResponse {

	/**
	 * code： 用户登录密钥
	 */
	private String code;
}
