package com.rythmos.service;

import org.springframework.stereotype.Service;

import com.rythmos.model.Order;

@Service
public interface Bar {
	
	public void placeOrder(Order order);

}
