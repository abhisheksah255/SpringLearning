package com.abhishek.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeApplication.class, args);
//Here we are creating the object and it will manage by us
		Laptop obj=new Laptop();
		obj.typing();
		
//Here object is created by Spring IOC and it will manage by them 
	ApplicationContext context=	SpringApplication.run(SpringBootPracticeApplication.class, args);
	Laptop obj1= context.getBean(Laptop.class);
	obj1.typing();
	
	}

}
