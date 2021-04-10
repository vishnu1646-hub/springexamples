package com.setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAqua {
   public static void main(String[] args) {
	   ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
	   Aquaman water = (Aquaman)context.getBean("dc");
	   water.message();
}
}
