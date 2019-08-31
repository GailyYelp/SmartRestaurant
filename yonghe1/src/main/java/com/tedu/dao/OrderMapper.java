package com.tedu.dao;

import java.util.List;

import com.tedu.pojo.Order;

public interface OrderMapper {
	List<Order> findAll();
	
	void deleteById(Integer id);
	
	
	void addOrder(Order order);
	
	
	Order findById(Integer id);
	
	void updateById(Order order);
}
