package com.house.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.house.bean.House;
import com.house.bean.Infor;
import com.house.bean.Location;
import com.house.dao.HouseDao;
@Repository("HouseDao")
public class HouseDaoImpl implements HouseDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private InforDaoImpl inforDaoImpl;
	@Autowired LocationDaoImpl locationDaoImpl;
	@Override
	public List<House> findAll() {
		String sql = "select * from addAndInfor";
		return jdbcTemplate.query(sql, new listMapper());
	}
	class listMapper implements RowMapper<House>{

		@Override
		public House mapRow(ResultSet rs, int arg1) throws SQLException {
			House house = new House();
			house.setHouseId(rs.getInt("id"));
			int lid = rs.getInt("lid");
			int iid = rs.getInt("iid");
			Infor infor = inforDaoImpl.findInforById(iid);
			Location location = locationDaoImpl.findById(lid);
			house.setInfor(infor);
			house.setLocation(location);
			return house;
		}
		
	}
	@Override
	public void addHouse(House house) {
		Infor infor = house.getInfor();
		Location location = house.getLocation();
		int lid = locationDaoImpl.addLocation(location);
		int iid = inforDaoImpl.addInfor(infor);
		String sql ="INSERT INTO addAndInfor(lid,iid) values(?,?)";
		int rows = jdbcTemplate.update(sql,lid,iid);
		System.out.println("addAndInfor添加插入行数 "+ rows);
	}

	@Override
	public House findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateHouse(House house) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<House> findByInforAndLocation(Infor infor, Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

}
