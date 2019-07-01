package com.lanou.service;

import java.util.List;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;
import com.lanou.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService{
	EmpDao empDao = new EmpDaoImpl();
	@Override
	public List<Emp> listAll() {
		return empDao.findAll();
	}
}




