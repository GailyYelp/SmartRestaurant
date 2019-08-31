package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;

@Service
public class DoorServiceImpl implements DoorService{
	
	@Autowired
	DoorMapper doorMapper;

	@Override
	public List<Door> findAll() {
		List<Door> list=doorMapper.findAll();
		return list;
	}

	@Override
	public void deleteById(Integer id) {
		doorMapper.deleteById(id);
	}

	@Override
	public void addDoor(Door door) {
		doorMapper.addDoor(door);
	}

	@Override
	public Door findById(Integer id) {
		Door door=doorMapper.findById(id);
		return door;
	}

	@Override
	public void updateById(Door door) {
		doorMapper.updateById(door);
	}

}
