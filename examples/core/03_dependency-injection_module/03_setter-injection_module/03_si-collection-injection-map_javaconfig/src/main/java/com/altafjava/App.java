package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.altafjava.bean.University;
import com.altafjava.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		University university = applicationContext.getBean(University.class);
		System.out.println(university);
	}
}
