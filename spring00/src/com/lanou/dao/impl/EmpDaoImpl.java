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
//数据访问层 多态
@Repository("empDao")
public class EmpDaoImpl implements EmpDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Emp> findAll() {
		String sql = "select * from emp";
		List<Emp> emps = jdbcTemplate.query(sql,new EmpMapper());
		return emps;
	}
	class EmpMapper implements RowMapper<Emp>{
		@Override
		public Emp mapRow(ResultSet rs, int index) throws SQLException {
			Emp emp = new Emp();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setSalary(rs.getDouble("salary"));
			emp.setAge(rs.getInt("age"));
			return emp;
		}
	}
	@Override
	public Emp findEmpbyId(int id) {
		String sql = "SELECT * FROM emp WHERE id=?";
		List<Emp> emps = jdbcTemplate.query(sql, new EmpMapper(), id);
		if (emps!=null&&emps.size()!=0) {
			return emps.get(0);
		}
		return null;
	}

	@Override
	public void addEmp(Emp emp) {
		String sql = "INSERT INTO emp(name,salary,age) values(?,?,?)";
		int rows = jdbcTemplate.update(sql, emp.getName(),emp.getSalary(),emp.getAge());
		System.out.println("插入行数"+rows);
	}

	@Override
	public void deleteEmpById(int id) {
		String sql = "DELETE FROM emp WHERE id=?";
		int rows = jdbcTemplate.update(sql,id);
		System.out.println("删除行数"+rows);
	}

	@Override
	public void updateEmp(Emp emp) {
		String sql = "UPDATE emp SET name=?,salary=?,age=? WHERE id=?";
		int rows = jdbcTemplate.update(sql,emp.getName(),emp.getSalary(),emp.getAge(),emp.getId());
		System.out.println("修改行数"+rows);
	}

}
