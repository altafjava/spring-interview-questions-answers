package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.altafjava.bean.ATM;
import com.altafjava.bean.Printer;

@ComponentScan
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
		ATM atm = applicationContext.getBean(ATM.class);
		Printer printer = atm.getPrinter();
		printer.printBalance(atm.getBankName(), 67839.93);
	}
}
