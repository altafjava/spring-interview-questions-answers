package com.altafjava;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.altafjava.bean.MyBean;

public class App {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		MyBean myBean1 = beanFactory.getBean(MyBean.class);
		MyBean myBean2 = (MyBean) beanFactory.getBean("myBean");
		System.out.println("Bean1 Hashcode: " + myBean1.hashCode());
		System.out.println("Bean2 Hashcode: " + myBean2.hashCode());
		System.out.println("are both beans same: " + (myBean1 == myBean2));
	}
}