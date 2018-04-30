package com.gareth.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// parent interface
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gareth/spring/springcoreadvanced/autowiring/annotations/config.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee);

	}
}
