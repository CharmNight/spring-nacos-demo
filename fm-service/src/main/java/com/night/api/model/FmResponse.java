package com.night.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 文件返回
 *
 * @author night
 * @date 2020-11-06
 */
@Data
public class FmResponse {
	/**
	 * 文件地址 str
	 *
	 *  这个demo 会 默认赋值 http://www.baidu.com
	 */
	@JsonProperty("fmStr")
	private String fmStr;
}
