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
 * ע�����ݷ��ʲ�
 * */
@Repository("empDao")
public class EmpDaoImpl implements EmpDao{
	/**	������ɾ�Ĳ�Ķ������Ϊ���Լ���װ��JdbcUtil������*/
	//��������ע��
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Emp> findAll() {
		String sql = "select * from emp";
		List<Emp> emps = jdbcTemplate.query(sql,new EmpMapper());
		return emps;
	}
	/**
	 * ��ӳ��
	 * �����ݱ��е�һ�м�¼ӳ���һ��Java����
	 * */
	class EmpMapper implements RowMapper<Emp>{
			/**
			 * �����ӳ�䷽��
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
		System.out.println("��������"+rows);
	}

	@Override
	public void deleteEmpById(int id) {
		String sql = "DELETE FROM emp WHERE id=?";
		int rows = jdbcTemplate.update(sql,id);
		System.out.println("ɾ������"+rows);
	}

	@Override
	public void updateEmp(Emp emp) {
		String sql = "UPDATE emp SET name=?,salary=?,age=? WHERE id=?";
		int rows = jdbcTemplate.update(sql, emp.getName(),emp.getSalary(),emp.getAge(),emp.getId());
		System.out.println("�޸�����"+rows);
	}

	/*public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
}
