package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.OrderMapper;
import com.tedu.pojo.Order;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderMapper orderMapper;

	@Override
	public List<Order> findAll() {
		List<Order> list = orderMapper.findAll();
		return list;
	}

	@Override
	public void deleteById(Integer id) {
		orderMapper.deleteById(id);
	}

	@Override
	public void addOrder(Order order) {
		orderMapper.addOrder(order);
	}

	@Override
	public Order findById(Integer id) {
		Order order = orderMapper.findById(id);
		return order;
	}

	@Override
	public void updateById(Order order) {
		orderMapper.updateById(order);
	}
	
	

}
