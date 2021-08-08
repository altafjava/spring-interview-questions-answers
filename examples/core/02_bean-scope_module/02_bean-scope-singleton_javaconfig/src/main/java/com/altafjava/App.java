package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.altafjava.bean.MyBean;
import com.altafjava.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MyBean myBean1 = applicationContext.getBean(MyBean.class);
		MyBean myBean2 = (MyBean) applicationContext.getBean("createMyBean");
		System.out.println("Bean1 Hashcode: " + myBean1.hashCode());
		System.out.println("Bean2 Hashcode: " + myBean2.hashCode());
		System.out.println("are both beans same: " + (myBean1 == myBean2));
	}
}