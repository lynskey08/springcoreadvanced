package com.gareth.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/gareth/spring/springcore/propertyplaceholder/config.xml");
		MyDAO dao = (MyDAO) ctx.getBean("myDAO");
		System.out.println(dao);
	}

}
