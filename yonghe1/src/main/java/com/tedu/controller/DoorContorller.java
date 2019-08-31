package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.pojo.Door;
import com.tedu.service.DoorService;

@Controller
public class DoorContorller {
	@Autowired
	DoorService doorService;
	
	@RequestMapping("/doorList")
	public String doorList(Model model) {
		List<Door> list=doorService.findAll();
		model.addAttribute("list",list);
		return "door_list";
	}
	
	@RequestMapping("/doorDelete")
	public String doorDelete(Integer id) {
		doorService.deleteById(id);
		return "redirect:/doorList";
	}
	
	@RequestMapping("/doorAdd")
	public String doorAdd(Door door) {
		doorService.addDoor(door);
		return "redirect:/doorList";
	}
	
	@RequestMapping("/doorInfo")
	public String doorInfo(Integer id,Model model) {
		Door door = doorService.findById(id);
		System.out.println("查找的door:"+door);
		
		model.addAttribute("door", door);
		return "door_update";
	}
	
	@RequestMapping("/doorUpdate")
	public String doorUpdate(Door door) {
		doorService.updateById(door);
		return "redirect:/doorList";
	}
}
