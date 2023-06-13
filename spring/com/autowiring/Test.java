package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiring.xml");

A obj=context.getBean("a",A.class);
obj.display();

}
}
