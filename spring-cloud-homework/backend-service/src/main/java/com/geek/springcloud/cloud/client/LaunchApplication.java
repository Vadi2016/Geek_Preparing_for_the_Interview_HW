package com.geek.springcloud.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class LaunchApplication {
	public static void main(String[] args) {
		SpringApplication.run(LaunchApplication.class, args);
	}
}

