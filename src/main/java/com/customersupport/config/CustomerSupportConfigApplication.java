package com.customersupport.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CustomerSupportConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerSupportConfigApplication.class, args);
	}
}
