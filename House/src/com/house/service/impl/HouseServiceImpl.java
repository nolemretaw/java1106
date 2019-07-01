package com.house.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.bean.House;
import com.house.bean.Infor;
import com.house.bean.Location;
import com.house.dao.HouseDao;
import com.house.service.HouseService;
@Service("houseService")
public class HouseServiceImpl implements HouseService {
	@Autowired
	private HouseDao houseDao;
	@Override
	public List<House> findAll() {
		return houseDao.findAll();
	}

	@Override
	public void addHouse(House house) {
		houseDao.addHouse(house);
	}

	@Override
	public void updateHouse(House house) {
		houseDao.updateHouse(house);
	}

	@Override
	public List<House> findByInforAndLocation(Infor infor, Location location) {
		// TODO Auto-generated method stub
		return houseDao.findByInforAndLocation(infor, location);
	}

	@Override
	public void deleteById(int id) {
		houseDao.deleteById(id);
	}

}
