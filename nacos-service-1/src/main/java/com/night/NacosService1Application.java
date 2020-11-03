package com.night;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author night
 * @date 2020-11-02
 */

@EnableDiscoveryClient
@SpringBootApplication
public class NacosService1Application {
	public static void main(String[] args) {
		SpringApplication.run(NacosService1Application.class, args);
	}

	@RestController
	public class EchoController {
		@GetMapping(value = "/echo/{string}")
		public String echo(@PathVariable String string) {
			return "Hello Nacos Discovery " + string;
		}
	}
}
