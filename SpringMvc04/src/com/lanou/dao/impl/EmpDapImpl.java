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
public class EmpDapImpl implements EmpDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
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
			emp.setAge(rs.getInt("age"));
			return emp;
		}
	}
	@Override
	public void addEmp(Emp emp) {
		String sql = "insert into emp(name,salary,age) values(?,?,?)";
		jdbcTemplate.update(sql,
				emp.getName(),emp.getSalary(),emp.getAge());
		
	}
}
