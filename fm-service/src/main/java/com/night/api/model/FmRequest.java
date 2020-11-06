package com.night.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 获取文件请求
 *
 * @author night
 * @date 2020-11-06
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
public class FmRequest {
	/**
	 * 文件ID
	 */
	@JsonProperty("fmId")
	private String fmId;
}
