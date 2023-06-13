package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
public static void main(String[] args) {
		
		
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycle.xml");

	Hello h=(Hello) context.getBean("hello");
h.getMsg();

context.registerShutdownHook();
}
}