package com.SI_map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

	Question q=(Question) context.getBean("que_map")	;
		q.show();
		
		
	}
}
