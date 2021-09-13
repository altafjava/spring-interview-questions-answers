package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.altafjava.bean.Continent;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Continent continent = applicationContext.getBean(Continent.class);
		System.out.println(continent);
	}
}
