package com.lovetolearn.servicec;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.core.Response;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ServiceCApplication {

	 @Value("${server.port}")
	 private int puerto;
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceCApplication.class, args);
	}
	/*
	@GetMapping("service-c/{name}")
	public String getResponse(@PathVariable String name) {

		System.out.println("Inside service-c");
		
		return "Hello " + name;
	}
	*/
	
	@GetMapping("service-c/{name}")
	public ResponseEntity<?> getResponse(@PathVariable String name){
		System.out.println("Inside service-c");
		
		return new ResponseEntity<>(Map.of("mensaje", "Hola " + name,
										    "puerto", puerto), HttpStatus.OK);
		
	}

}
