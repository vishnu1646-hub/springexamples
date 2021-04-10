package com.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUA {
	public static void main(String[] args) {
		ApplicationContext ref = new ClassPathXmlApplicationContext("applicationContext.xml");
		QuestionUA ref1 = (QuestionUA) ref.getBean("q");
		ref1.displayInfo();
	}
}
