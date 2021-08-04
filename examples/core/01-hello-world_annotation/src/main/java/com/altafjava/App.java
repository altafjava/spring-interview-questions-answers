package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.altafjava.service.GreetingManager;

@ComponentScan
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
		GreetingManager greetingManager = applicationContext.getBean(GreetingManager.class);
		greetingManager.sayGreet();
	}
}