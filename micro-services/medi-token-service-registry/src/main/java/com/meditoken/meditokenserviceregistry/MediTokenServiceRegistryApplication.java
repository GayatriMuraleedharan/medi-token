package com.meditoken.meditokenserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MediTokenServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediTokenServiceRegistryApplication.class, args);
	}

}
