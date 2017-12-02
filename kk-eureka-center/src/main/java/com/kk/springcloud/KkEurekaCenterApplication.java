package com.kk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KkEurekaCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(KkEurekaCenterApplication.class, args);
	}
}
