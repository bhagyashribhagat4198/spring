package com.CI_map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.CI_basic.Teacher;

public class Test {

public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("applicationContext.xml")	;
			
		BeanFactory factory =new XmlBeanFactory(resource);
		
	College c=	(College) factory.getBean("college_bean");
		
		c.show();
		}
}
