package com.lanou.jdbc;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.rmi.CORBA.Stub;

/**
 *EmpDao接口实现类
 */
public class EmpDaoImpl implements EmpDao{

	@Override
	public List<Emp> findAll() {
		List<Emp> emps = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			System.out.println("调用");
			if (conn!=null) {
				System.out.println("建立连接");
			}else {
				System.out.println("未建立连接");
			}
			String sql = "select * from myemp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			//将每一行记录封装成一个emp对象,然后存入list集合
			while(rs.next()){
				int id	= rs.getInt("id");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String job = rs.getString("job");
				double salary = rs.getDouble("salary");
				Date hiredate = rs.getDate("hiredate");
				int deptno = rs.getInt("deptno");
				
				Emp emp = new Emp(
					id, name, sex, job, salary, 
					hiredate, deptno);
				emps.add(emp);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.release(conn, pstmt, rs);
		}
		return emps;
	}

	@Override
	public Emp findEmpById(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Emp emp = null;
		try {
			conn = JdbcUtil.getConnection();
			pstmt = conn.prepareStatement(
				"select * from myemp where id=?");
			pstmt.setInt(1,id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				emp = new Emp();
				emp.setId(id);
				emp.setName(rs.getString("name"));
				emp.setSex(rs.getString("sex"));
				emp.setJob(rs.getString("job"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setDeptno(rs.getInt("deptno"));
			}
		} catch (Exception e) {
		} finally {
			JdbcUtil.release(conn, pstmt, rs);
		}
		return emp;
	}
	/**
	*String[] array;
	*array = {1,2,3};
	*
	*array = new String[]{1,2,3}
	 */
	@Override
	public int deleteEmpById(int id) {
		return update(
			"delete from myemp where id=?",
			new Object[]{id});
	}

	@Override
	public int addEmp(Emp emp) {
		return update(
				"insert into myemp(name,sex,job,"
				+ "salary,hiredate,deptno)"
				+ "values(?,?,?,?,?,?)",
				new Object[]{
					emp.getName(),
					emp.getSex(),
					emp.getJob(),
					emp.getSalary(),
					emp.getHiredate(),
					emp.getDeptno()
				});
	}

	@Override
	public int updateEmp(Emp emp) {
		return update(
				"update myemp set "
				+ "name=?,"
				+ "sex=?,"
				+ "job=?,"
				+ "salary=?,"
				+ "hiredate=?,"
				+ "deptno=?"
				+ "where id=?",
				new Object[]{
					emp.getName(),
					emp.getSex(),
					emp.getJob(),
					emp.getSalary(),
					emp.getHiredate(),
					emp.getDeptno(),
					emp.getId()
				});
	}
	
	/**
	 * 对增删改三个方法封装
	 * @param sql
	 * @param parameter  给占位符参数
	 * @return  DML操作受影响行数
	 */
	public int update(String sql,Object[] parameters){
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = JdbcUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			//给占位符赋值
			for(int i=0;i<parameters.length;i++){
				pstmt.setObject(i+1,parameters[i]);
			}
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.release(conn,pstmt,null);
		}
		return 0;
	}
	
}
