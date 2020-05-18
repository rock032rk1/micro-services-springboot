package com.hospitality.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PathologyService1Application {

	public static void main(String[] args) {
		SpringApplication.run(PathologyService1Application.class, args);
	}

}
