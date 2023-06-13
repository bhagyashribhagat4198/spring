package com.CI_basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test_Employee
{
	public static void main(String[] args) {
		
	Resource resource= new ClassPathResource("applicationContext.xml")	;
		
	BeanFactory factory =new XmlBeanFactory(resource);
	
	Employee e=(Employee) factory.getBean("employeebean");
	e.employee_info();
	
	
	}
}
