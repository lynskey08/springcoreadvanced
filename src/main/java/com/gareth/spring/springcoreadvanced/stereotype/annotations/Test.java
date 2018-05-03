package com.gareth.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gareth/spring/springcoreadvanced/stereotype/annotations/config.xml");
		Instructor instructor = (Instructor) ctx.getBean("inst");
		System.out.println(instructor);
		
		Instructor instructor2 = (Instructor) ctx.getBean("inst");
		System.out.println(instructor2);
		
		
		System.out.println("\nThis displays the min value that an integer can hold which\nI accessed from a static variable on the Integer class through\nthe @Value annotation using Spring Expression Language "+Integer.MIN_VALUE);
	
		
	}

}
