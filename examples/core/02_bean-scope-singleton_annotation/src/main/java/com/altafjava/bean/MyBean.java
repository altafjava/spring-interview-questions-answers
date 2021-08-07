package com.altafjava.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton") /* Here @Scope annotation is not required because by default bean scope is singleton */
public class MyBean {

	public MyBean() {
		System.out.println("Constructor executed only once but getBean() method invoked 2 times");
	}

}
