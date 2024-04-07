package com.lovetolearn.serviceb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lovetolearn.serviceb.config.ConfigService;

@SpringBootApplication
@RestController
@EnableFeignClients
@EnableDiscoveryClient
public class ServiceBApplication {

	@Autowired
	ConfigService configService;

	public static void main(String[] args) {
		SpringApplication.run(ServiceBApplication.class, args);
	}

	@GetMapping("service-b/{name}")
	public String getResponse(@PathVariable String name) {

		System.out.println("Inside service-b");

		return configService.getResponse(name);
	}

}
