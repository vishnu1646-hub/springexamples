package com.framework;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestEmployee {
     public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		Employee reference = (Employee)factory.getBean("employee");
		reference.show();
	}
}
