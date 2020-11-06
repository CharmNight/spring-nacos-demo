package com.night.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 配置中心
 * <p>
 * 这是官方文档的demo 为了方便展示
 *
 * @author night
 */
@Controller
@RefreshScope
public class UserDemoController {

	@Value("${username:null}")
	private String username;

	@RequestMapping(value = "/getUser")
	@ResponseBody
	public String getUser() {
		return "user" + username;
	}
}