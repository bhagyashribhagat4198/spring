package com.CI_basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test_Teacher {

	public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("applicationContext.xml")	;
			
		BeanFactory factory =new XmlBeanFactory(resource);
		
		Teacher t=(Teacher) factory.getBean("teacherbean");
		t.show_info();
		
		
		}
}
