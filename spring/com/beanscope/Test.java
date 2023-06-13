package com.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beanscope.xml");

	Hello h=	(Hello) context.getBean("hello");
		
	h.setMsg("Hello User");
	h.getMsg();
	
	
	Hello h1=	(Hello) context.getBean("hello");
	h1.getMsg();

}
}
