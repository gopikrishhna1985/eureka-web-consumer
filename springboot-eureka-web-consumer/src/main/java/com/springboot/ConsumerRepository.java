package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ConsumerRepository {

	@Autowired
	protected RestTemplate restTemplate;

	public String getResponseFromEurekaClient() {
		String message = restTemplate.getForObject("http://STUDENT-EUREKA-CLIENT"+"/student", String.class);
		return message;
	}

}
