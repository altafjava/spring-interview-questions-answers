package com.altafjava.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ATM {
	@Value("ICICI")
	private String bankName;
	@Autowired
	private Printer printer;

	public String getBankName() {
		return bankName;
	}

	public Printer getPrinter() {
		return printer;
	}

}
