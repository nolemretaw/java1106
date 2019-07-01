package com.lanou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;
import com.lanou.service.EmpService;
//业务层
@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao empDao;
	
	@Override
	public List<Emp> findAll() {
		return empDao.findAll();
	}

	@Override
	public Emp findEmpById(int id) {
		// TODO Auto-generated method stub
		return empDao.findEmpbyId(id);
	}

	@Override
	public void insert(Emp emp) {
		// TODO Auto-generated method stub
		empDao.addEmp(emp);
		System.out.println("插入数据");
	}

	@Override
	public void deleteEmpById(int id) {
		// TODO Auto-generated method stub
		empDao.deleteEmpById(id);
		System.out.println("数据删除");
	}

	@Override
	public void updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		empDao.updateEmp(emp);
		System.out.println("数据修改");
	}

}
