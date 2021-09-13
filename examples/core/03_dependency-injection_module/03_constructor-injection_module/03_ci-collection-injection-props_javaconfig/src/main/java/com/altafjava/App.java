package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.altafjava.bean.Scientist;
import com.altafjava.config.AppConfig;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Scientist scientist = applicationContext.getBean(Scientist.class);
		System.out.println(scientist);
	}
}
