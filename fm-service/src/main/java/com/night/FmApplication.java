package com.night;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author night
 * @date 2020-11-02
 */

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FmApplication {
	public static void main(String[] args) {
		SpringApplication.run(FmApplication.class, args);
	}
}
