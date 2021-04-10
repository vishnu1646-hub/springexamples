package com.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
		ApplicationContext reference = new ClassPathXmlApplicationContext("applicationContext.xml");
		 Student link = (Student)reference.getBean("studentbean");
		 link.displayInfo();
	}
}
