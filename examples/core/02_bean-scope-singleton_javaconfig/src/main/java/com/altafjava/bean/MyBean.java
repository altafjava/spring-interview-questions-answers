package com.altafjava.bean;

public class MyBean {

	public MyBean() {
		System.out.println("Constructor executed only once but getBean() method invoked 2 times");
	}

}
