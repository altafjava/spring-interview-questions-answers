package com.altafjava.bean.impl;

import com.altafjava.bean.GreetingService;

public class GreetingServiceImpl implements GreetingService {

	@Override
	public String greet() {
		return "Hello World XML: Welcome to Spring Framework";
	}

}
