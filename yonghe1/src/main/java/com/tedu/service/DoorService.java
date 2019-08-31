package com.tedu.service;

import java.util.List;

import com.tedu.pojo.Door;

public interface DoorService {
	
	public List<Door> findAll();
	
	
	public void deleteById(Integer id);
	
	
	public void addDoor(Door door);
	
	
	public Door findById(Integer id);
	
	
	public void updateById(Door door);
	
	
	
	
}
