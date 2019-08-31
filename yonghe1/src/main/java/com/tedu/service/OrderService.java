package com.tedu.service;

import java.util.List;

import com.tedu.pojo.Order;

public interface OrderService {
	
	List<Order> findAll();
	
	
	void deleteById(Integer id);
	
	
	void addOrder(Order order);
	
	
	Order findById(Integer id);
	
	
	void updateById(Order order);
	
	
	
	
	
	

}
