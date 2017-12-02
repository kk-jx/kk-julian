package com.kk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableAutoConfiguration
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class KkConfigCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(KkConfigCenterApplication.class, args);
	}
}
