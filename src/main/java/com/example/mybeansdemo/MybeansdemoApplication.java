package com.example.mybeansdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MybeansdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MybeansdemoApplication.class, args);

		context.getBean(BankComponent.class).deposit(100.00, "SavingsAccount");
		context.getBean(BankComponent.class).deposit(200.00, "CurrentAccount");
	}

}
