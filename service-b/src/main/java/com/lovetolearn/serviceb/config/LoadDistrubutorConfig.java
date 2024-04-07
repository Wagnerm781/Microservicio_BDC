package com.lovetolearn.serviceb.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

@LoadBalancerClient(value = "service-c")
public class LoadDistrubutorConfig {

	@LoadBalanced
	@Bean
	public Feign.Builder feignBuilder(){
		
		return Feign.builder();
	}
	
}
