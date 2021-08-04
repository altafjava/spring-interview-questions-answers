package com.altafjava.service;

import com.altafjava.bean.GreetingService;

public class GreetingManager {

	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void sayGreet() {
		System.out.println(greetingService.greet());
	}
}
