package com.lanou.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;

import jdbc.JdbcUtil;

public class EmpDaoImpl implements EmpDao {

	@Override
	public List<Emp> findAll() {
		List<Emp> emps = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//获取连接
			conn = JdbcUtil.getConnection();
			//预编译sql语句
			String sql = "select * from emp";
			pstmt = conn.prepareStatement(sql);
			//执行sql语句并处理返回结果
			rs = pstmt.executeQuery();
			while (rs.next()) {
				//每行记录对应一个emp对象
				Emp emp = new Emp();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setAge(rs.getInt("age"));
				//加入集合
				emps.add(emp);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.release(conn, pstmt, rs);
		}
		return emps;
	}

	@Override
	public boolean deleteById(int id) {
		//sql语句
		String sql = "delete from emp where id=?";
		Object[] parameters = {id};
		int rows = JdbcUtil.update(sql, parameters);
		if (rows!=0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean addEmp(Emp emp) {
		String sql = "insert into emp(name,salary,age) values(?,?,?)";
		Object[] parameters =  new Object[]{
				emp.getName(),emp.getSalary(),emp.getAge()
				};
		if (JdbcUtil.update(sql, parameters)!=0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateEmp(Emp emp) {
		String sql = "update emp set name=?,salary=?,age=? where id=?";
		Object[] parameters = new Object[]{emp.getName(),emp.getSalary(),emp.getAge(),emp.getId()};
		if (JdbcUtil.update(sql, parameters)!=0) {
			return true;
		}
		return false;
	}

	@Override
	public Emp findEmpById(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Emp emp = null;
		String sql = "select * from emp where id=?";
		try {
			conn = JdbcUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				emp = new Emp();
				emp.setId(id);		
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setAge(rs.getInt("age"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.release(conn, pstmt, rs);
		}
		return emp;
	}
	
	@Override
	public List<String> getRsmd() {
		String sql = "select * from emp where id='1'";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		//colList存放列名
		List<String> colList = new ArrayList<>();
		try {
			conn = JdbcUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();
			if (rs.next()) {
				for(int i = 0;i<rsmd.getColumnCount();i++){
					colList.add(rsmd.getColumnName(i+1));
				}
			}
			return colList;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.release(conn, pstmt, rs);
		}
		return colList;
	}
}
