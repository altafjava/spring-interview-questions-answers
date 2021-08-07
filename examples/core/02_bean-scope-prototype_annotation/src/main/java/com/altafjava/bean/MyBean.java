package com.altafjava.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class MyBean {

	public MyBean() {
		System.out.println("MyBean Constructor executed");
	}

}
