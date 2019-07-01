package com.lanou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;
import com.lanou.service.EmpService;
//ҵ���
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
		System.out.println("��������");
	}

	@Override
	public void deleteEmpById(int id) {
		// TODO Auto-generated method stub
		empDao.deleteEmpById(id);
		System.out.println("����ɾ��");
	}

	@Override
	public void updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		empDao.updateEmp(emp);
		System.out.println("�����޸�");
	}

}
