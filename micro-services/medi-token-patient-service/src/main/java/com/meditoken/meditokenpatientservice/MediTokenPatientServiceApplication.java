package com.meditoken.meditokenpatientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MediTokenPatientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediTokenPatientServiceApplication.class, args);
	}

}
