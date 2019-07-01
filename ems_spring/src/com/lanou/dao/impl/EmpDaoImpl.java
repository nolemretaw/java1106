package com.lanou.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;
@Repository("EmpDao")
public class EmpDaoImpl implements EmpDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int countPage(int pageSize) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Emp> findAll() {
		String sql = "select * from emp";
		return jdbcTemplate.query(sql, new EmpMapper());
	}
	class EmpMapper implements RowMapper<Emp>{

		@Override
		public Emp mapRow(ResultSet rs, int arg1) throws SQLException {
			Emp emp = new Emp();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setSalary(rs.getDouble("salary"));
			return null;
		}
		
	}
	
	@Override
	public List<Emp> findPage(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addEmp(Emp emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Emp findEmpById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getRsmd() {
		// TODO Auto-generated method stub
		return null;
	}

}
