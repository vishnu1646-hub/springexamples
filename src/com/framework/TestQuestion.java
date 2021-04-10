
package com.framework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestQuestion {
	public static void main(String[] args) {
		/*Resource resource = new ClassPathResource("applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		Question ref = (Question) factory.getBean("questionanswer");
		ref.displayInfo();*/
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Question ref = (Question)context.getBean("questionanswer");
	    ref.displayInfo();
	}
}
