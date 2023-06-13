package com.SI_basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
	
		
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

		//Employee e=(Employee) context.getBean("emp_bean");
	
	//e.show();
	
		Costumer c=	(Costumer) context.getBean("customerbean");
		c.show();
	}
}
