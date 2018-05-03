package com.gareth.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gareth/spring/springcoreadvanced/standalone/collections/config.xml");
		ProductsList pl = (ProductsList) ctx.getBean("productsList");
		System.out.println(pl);
	}
}
