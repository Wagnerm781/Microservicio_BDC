package com.lovetolearn.serviceb.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( value = "service-c")
public interface ConfigService {

	@GetMapping("service-c/{name}")
	public String getResponse(@PathVariable String name);

}
