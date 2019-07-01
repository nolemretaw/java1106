package com.house.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.house.bean.House;
import com.house.service.HouseService;

@Controller
@RequestMapping("/house")
public class HouseController {
	@Autowired
	private HouseService houseService;
	@RequestMapping(value="findAll")
	public List<House> listAll(Model model){
		List<House> houses = houseService.findAll();	
		return houses;
	}
}
