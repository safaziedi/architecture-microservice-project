package com.example.EPsychiatrie;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class EPsychiatrieApplication {

	public static void main(String[] args) {
		SpringApplication.run(EPsychiatrieApplication.class, args);
	}

}
