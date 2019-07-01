package com.lanou.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;
/**
 * 注入数据访问层
 * */
@Repository("empDao")
public class EmpDaoImpl implements EmpDao{
	/**	用于增删改查的对象，理解为是自己封装的JdbcUtil工具类*/
	//按照类型注入
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Emp> findAll() {
		String sql = "select * from emp";
		List<Emp> emps = jdbcTemplate.query(sql,new EmpMapper());
		return emps;
	}
	/**
	 * 行映射
	 * 将数据表中的一行记录映射成一个Java对象
	 * */
	class EmpMapper implements RowMapper<Emp>{
			/**
			 * 具体的映射方法
			 * */
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
	public Emp findEmpById(int id) {
		String sql = "SELECT * FROM emp WHERE id=?";
//		Emp emp = jdbcTemplate.queryForObject(
//				sql,new EmpMapper(),id);
		List<Emp> emps = jdbcTemplate.query(sql,new EmpMapper(),id);
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
		int rows = jdbcTemplate.update(sql, emp.getName(),emp.getSalary(),emp.getAge(),emp.getId());
		System.out.println("修改行数"+rows);
	}

	/*public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
}
