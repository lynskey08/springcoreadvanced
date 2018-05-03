package com.gareth.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*Normally @Component will create an instance of Instructor
 * and name it using camel casing. If you want to name it
 * something different, you must provide a name for it 
 * after @Component in the parenthesis*/
@Component("inst")
@Scope("prototype") //using @Scope annotations
public class Instructor {

	//using class name to invoke a static method in the expression
	//@Value("#{T(java.lang.Math).abs(-123)}") //these values override all other values that have been assigned
	//@Value("#{new Integer(88)}")//create onject inside the expression
	@Value("#{T(java.lang.Integer).MIN_VALUE}")//accessing static variable in an object
	private int id = 15;
	//invoking methods on a string
	//@Value("#{'Gareth Lynskey'.toUpperCase()}")
	@Value("#{new java.lang.String('Gareth Lynskey')}")//string must be inside single quotes
	private String name = "Shane";
	
	//syntax for injecting collection types using annotations
	@Value("#{topics}") 
	private List<String> topics;
	
	//syntax for injecting object types using annotations
	@Autowired
	private Profile profile;
	
	//Expressing Boolean types
	@Value("#{2+4>5?true:false}")
	private boolean active;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", active="
				+ active + "]";
	}
}
