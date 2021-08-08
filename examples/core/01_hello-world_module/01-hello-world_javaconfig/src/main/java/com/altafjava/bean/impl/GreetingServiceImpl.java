package com.altafjava.bean.impl;

import com.altafjava.bean.GreetingService;

public class GreetingServiceImpl implements GreetingService {

	@Override
	public String greet() {
		return "Hello World JavaConfig: Welcome to Spring Framework";
	}

}
