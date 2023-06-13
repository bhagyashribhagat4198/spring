package com.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		// IoC by BeanFactor
		
		/*Resource resourse=new ClassPathResource("applicationContext.xml");	
		BeanFactory factory = new XmlBeanFactory(resourse);
		
		Student s=	(Student) factory.getBean("studentbean");
		s.student_info();*/
		
		// Ioc by ApplicationContext
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s1=(Student) context.getBean("studentbean");
		
		s1.student_info();
	}
}
