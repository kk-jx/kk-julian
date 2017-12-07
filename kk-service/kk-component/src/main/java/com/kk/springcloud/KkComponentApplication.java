package com.kk.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@MapperScan(basePackages = {"com.kk.springcloud.mapper.WxComponentMapper"})
@SpringBootApplication
public class KkComponentApplication {

	public static void main(String[] args) {
		SpringApplication.run(KkComponentApplication.class, args);
	}
}
