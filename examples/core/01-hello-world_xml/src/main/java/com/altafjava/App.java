package com.altafjava;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.altafjava.service.GreetingManager;

public class App {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		GreetingManager greetingManager = beanFactory.getBean(GreetingManager.class);
		greetingManager.sayGreet();
	}
}