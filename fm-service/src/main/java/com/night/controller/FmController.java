package com.night.controller;

import com.night.api.FmApi;
import com.night.api.model.FmRequest;
import com.night.api.model.FmResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author night
 * @date 2020-11-06
 */
@RestController
public class FmController implements FmApi {
	private static final String FM_RES_STR = "http://www.baidu.com/";
	@Override
	public ResponseEntity<FmResponse> queryFmDetail(@Valid @RequestBody FmRequest request) {
		FmResponse fmResponse = new FmResponse();
		fmResponse.setFmStr(FM_RES_STR + request.getFmId());
		return ResponseEntity.ok(fmResponse);
	}
}
