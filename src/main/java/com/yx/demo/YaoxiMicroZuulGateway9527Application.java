package com.yx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class YaoxiMicroZuulGateway9527Application {

	public static void main(String[] args) {
		SpringApplication.run(YaoxiMicroZuulGateway9527Application.class, args);
	}

}
