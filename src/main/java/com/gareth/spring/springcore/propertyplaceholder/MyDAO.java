package com.gareth.spring.springcore.propertyplaceholder;

public class MyDAO {

	private String dbServer;
	private int dbPort;
	
	MyDAO(String dbServer){
		this.dbServer=dbServer;
	}
	
	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + "]";
	}
	
}
