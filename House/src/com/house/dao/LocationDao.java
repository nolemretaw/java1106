package com.house.dao;

import java.util.List;

import com.house.bean.Location;

public interface LocationDao {
	public List<Location> findAll();
	public int countAll();
	public int addLocation(Location location);
	public Location findById(int id);
	public int updateLocation(Location location);
	public List<Location> findByAddressAndBeam(String address,String beam);
	public void deleteById(int id);
}
