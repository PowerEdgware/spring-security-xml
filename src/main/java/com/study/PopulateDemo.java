package com.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PopulateDemo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("min-demo.xml");
		
		DemoService demoServie=context.getBean(DemoService.class);
		demoServie.printPropertyService();
		
		context=null;
	}
}
