package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.altafjava.bean.Country;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Country country = applicationContext.getBean(Country.class);
		System.out.println(country);
	}
}
