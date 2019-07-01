package com.lanou.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;
import com.lanou.service.EmpService;

import jdbc.DaoFactory;
import jdbc.JdbcUtil;

public class EmpServiceImpl implements EmpService{
	private EmpDao dao;
	private Connection conn;
	
	public EmpServiceImpl() {
		try {
			dao = (EmpDao)DaoFactory.getDao("empDao").newInstance();
			conn = JdbcUtil.getConnection();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public int countPage(int pageSize) {
		return dao.countPage(pageSize);
	}

	@Override
	public List<Emp> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Emp> findPage(int pageNum, int pageSize) {
		return dao.findPage(pageNum, pageSize);
	}

	@Override
	public boolean deleteById(int id) {
//		boolean result = false;
//		try {
//			//开启事物
//			conn.setAutoCommit(false);
//			result = dao.deleteById(id);
//			//提交事物
//			conn.commit();
//		} catch (Exception e) {
//			//回滚事物
//			try {
//				conn.rollback();				
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
		return dao.deleteById(id);
	}

	@Override
	public boolean addEmp(Emp emp) {
		
		
		return dao.addEmp(emp);
	}
	/**
	 * 如果dao层已经关闭了连接对象，在业务层再获取，会出现异常，
	 * 解决：在业务层里统一关闭连接对象
	 * */
	@Override
	public boolean updateEmp(Emp emp) {
		return dao.updateEmp(emp);
	}

	@Override
	public Emp findEmpById(int id) {
		return dao.findEmpById(id);
	}

	@Override
	public List<String> getRsmd() {
		return dao.getRsmd();
	}

}
