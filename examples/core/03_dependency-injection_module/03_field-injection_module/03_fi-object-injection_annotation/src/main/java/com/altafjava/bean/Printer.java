package com.altafjava.bean;

import org.springframework.stereotype.Component;

@Component
public class Printer {

	public void printBalance(String bankName, double balance) {
		System.out.println("Total balance in " + bankName + " bank is: " + balance);
	}
}
