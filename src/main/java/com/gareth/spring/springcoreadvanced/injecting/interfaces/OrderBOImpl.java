package com.gareth.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("dao2")//this will inject the OrderDAOImpl bean
	private OrderDAO dao;//injecting implementation of OrderDAO interface

	@Override
	public void placeOrder() {
		System.out.println("Inside order BO");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	//does the property injection
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
