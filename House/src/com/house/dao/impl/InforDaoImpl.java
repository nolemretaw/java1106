package com.house.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.house.bean.Infor;
import com.house.dao.InforDao;
@Repository("InforDao")
public class InforDaoImpl implements InforDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Infor> findAll() {
		String sql = "SELECT * FROM Infors";
		List<Infor> infors = jdbcTemplate.query(sql, new InforMapper());
		return infors;
	}
	class InforMapper implements RowMapper<Infor>{

		@Override
		public Infor mapRow(ResultSet rs, int arg1) throws SQLException {
			Infor infor = new Infor();
			infor.setIid(rs.getInt("iid"));
			infor.setKind(rs.getString("kind"));
			infor.setHousingArea(rs.getDouble("housingArea"));
			infor.setRentalArea(rs.getDouble("rentalArea"));
			infor.setStructure(rs.getString("structure"));
			infor.setCharac(rs.getString("charac"));
			infor.setState(rs.getString("state"));
			return infor;
		}	
	}
	@Override
	public int addInfor(Infor infor) {
		int iid = findByInfor(infor);
		int rows = 0;
		if (iid==0) {//新添加
			String sql = "INSERT INTO infors(kind,housingArea,rentalArea,structure,charac,state) "
					+ "values(?,?,?,?,?,?,?)";
			rows = jdbcTemplate.update(sql,infor.getKind(),infor.getHousingArea(),infor.getRentalArea(),
					infor.getStructure(),infor.getCharac(),infor.getState());
			iid = countAll();
		}//现有，直接返回iid
		System.out.println("infor添加插入行数 "+rows+"/ 添加位置 "+iid);
		return iid;
	}

	@Override
	public int updateInfor(Infor infor) {
		String sql = "UPDATE infor SET kind=?,housingArea=?,rentalArea=?,structure=?,"
				+ "charac=?,state=? WHERE iid=?";
		int rows = jdbcTemplate.update(sql,infor.getKind(),infor.getHousingArea(),infor.getRentalArea(),
				infor.getStructure(),infor.getCharac(),infor.getState());
		System.out.println("infor修改行数"+rows);
		return infor.getIid();
	}

	@Override
	public Infor findInforById(int iid) {
		String sql = "SELECT * FROM infors WHERE iid=?";
		List<Infor> infors = jdbcTemplate.query(sql, new InforMapper(),iid);
		if (infors!=null&&infors.size()!=0) {
			return infors.get(0);
		}
		return null;
	}

	@Override
	public List<Infor> findByKindAndState(String kind, String state) {
		String sql = "select * from infors where kind=? and state=?";
		
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int countAll() {
		String sql = "select count(*) from infors";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public int findByInfor(Infor infor) {
		String sql = "select iid from infors where kind=? and housingArea=? and rentalArea=? and structure=? and charac=? and state=?";
		List<Infor> infors = jdbcTemplate.query(sql, new InforMapper());
		if (infors!=null&&infors.size()!=0) {
			return infors.get(0).getIid();
		}
		return 0;
	}

}
