package com.lanou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;
import com.lanou.service.EmpService;
@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao empDao;
	@Override
	public List<Emp> findAll() {
		// TODO Auto-generated method stub
		return empDao.findAll();
	}
	@Override
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		empDao.addEmp(emp);
	}

}
