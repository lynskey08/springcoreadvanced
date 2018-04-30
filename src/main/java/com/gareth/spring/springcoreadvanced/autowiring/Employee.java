package com.gareth.spring.springcoreadvanced.autowiring;

public class Employee {
	
	Employee(Address address){
		this.address = address;
	}

	//So what happens is the autowire byType attribute on the employee bean
	//will search the employee class and and what object dependencies 
	//it has and it will find address and look at what it's type is.
	//It will then take the address and go back to the config file
	//and searches which bean tag has a class as address.
	//As soon as it finds it, it will instantiate that bean if
	//it in not already instantiated and then it will inject that 
	//bean into employee using setter injection
	private Address address;
	//autowire byName searches for the class of the matching name of 
	//the variable here

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
