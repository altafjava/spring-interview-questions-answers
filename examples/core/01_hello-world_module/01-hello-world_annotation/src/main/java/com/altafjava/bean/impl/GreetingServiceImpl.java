package com.altafjava.bean.impl;

import org.springframework.stereotype.Component;
import com.altafjava.bean.GreetingService;

@Component
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String greet() {
		return "Hello World Annotation: Welcome to Spring Framework";
	}

}
