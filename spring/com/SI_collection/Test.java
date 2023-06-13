package com.SI_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

 //Question q= (Question) context.getBean("q1");
	
	//q.show();

Que a=(Que) context.getBean("q11");
	
	a.show();
	
	}
}