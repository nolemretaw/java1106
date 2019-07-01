package com.house.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.house.bean.Location;
import com.house.dao.LocationDao;
@Repository("LocationDao")
public class LocationDaoImpl implements LocationDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Location> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	class LocationMapper implements RowMapper<Location>{

		@Override
		public Location mapRow(ResultSet rs, int arg1) throws SQLException {
			Location location = new Location();
			location.setLid(rs.getInt("lid"));
			location.setAddress(rs.getString("address"));
			location.setBeam(rs.getInt("beam"));
			location.setStorey(rs.getInt("storey"));
			location.setRoom(rs.getInt("room"));
			return location;
		}	
	}
	
	@Override
	public int addLocation(Location location) {
		String sql = "INSERT INTO locations(address,beam,storey,room) "
				+ "values(?,?,?,?)";
		int rows = jdbcTemplate.update(sql,location.getAddress(),location.getBeam(),location.getStorey(),location.getRoom());
		int count = countAll();
		System.out.println("location添加插入行数"+rows+"/总条数 "+count);
		return count;
	}
	
	@Override
	public Location findById(int lid) {
		String sql = "select * from locations WHERE lid=?";
		List<Location> locations = jdbcTemplate.query(sql, new LocationMapper(),lid);
		if (locations!=null&&locations.size()!=0) {
			return locations.get(0);
		}
		return null;
	}

	@Override
	public int updateLocation(Location location) {
		String sql = "UPDATE locations SET address=?,beam=?,storey=?,room=? WHERE lid=?";
		int rows = jdbcTemplate.update(sql,location.getAddress(),location.getBeam(),location.getStorey(),location.getRoom(),location.getLid());
		System.out.println("location修改行数 "+rows);
		return location.getLid();
	}
	
	@Override
	public List<Location> findByAddressAndBeam(String address, String beam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int countAll() {
		String sql = "select count(*) from locations";
		int count = jdbcTemplate.queryForObject(sql, int.class);
		
		return count;
	}

}
