package com.gareth.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	//the @Autowired annotation can be user at the setter level,
	//field level and the constructor level
	
	//the @Qualifier annotation tells the container it should
	//find a bean with the name "address123"
	
	Employee(Address address){
		this.address = address;
	}
	
	@Autowired(required=false)
	@Qualifier("address123")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
