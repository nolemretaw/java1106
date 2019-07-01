package com.house.service;

import java.util.List;

import com.house.bean.House;
import com.house.bean.Infor;
import com.house.bean.Location;

public interface HouseService {
	public List<House> findAll();
	public void addHouse(House house);
	public void updateHouse(House house);
	public List<House> findByInforAndLocation(Infor infor,Location location);
	public void deleteById(int id);
}
