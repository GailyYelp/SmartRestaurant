package com.tedu.dao;

import java.util.List;

import com.tedu.pojo.Door;

public interface DoorMapper {
	
	
	/*
	 * 1.Mapper接口全路径要和mapper文件的namespace保持一致
	 * 2.Mapper接口中的方法名字要和sql标签的id值保持一致
	 * 3.Mapper接口中方法的返回值类型和参数类型要和sql标签的返回值类型以及参数类型保持一致
	 * */
	public List<Door> findAll();
	
	public void deleteById(Integer id);
	
	public void addDoor(Door door);
	
	public Door findById(Integer id);
	
	public void updateById(Door door);
}
