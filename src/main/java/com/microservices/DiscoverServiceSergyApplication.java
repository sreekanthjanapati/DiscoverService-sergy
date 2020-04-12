package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoverServiceSergyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverServiceSergyApplication.class, args);
	}

}
