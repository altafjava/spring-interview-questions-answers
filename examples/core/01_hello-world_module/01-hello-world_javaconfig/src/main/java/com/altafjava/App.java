package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.altafjava.config.AppConfig;
import com.altafjava.service.GreetingManager;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		GreetingManager greetingManager = applicationContext.getBean(GreetingManager.class);
		greetingManager.sayGreet();
	}
}