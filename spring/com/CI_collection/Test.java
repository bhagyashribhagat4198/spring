package com.CI_collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("applicationContext.xml")	;
			
		BeanFactory factory =new XmlBeanFactory(resource);
		
		//Question q=(Question) factory.getBean("questionbean");
		//q.display_info();
		
		Que q=(Que) factory.getBean("que_bean");
		q.display();
		}
}
