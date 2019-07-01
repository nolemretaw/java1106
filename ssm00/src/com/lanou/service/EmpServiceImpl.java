package com.lanou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpMapper;
@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper empMapper;
	
	@Override
	public List<Emp> findAllEmp() {
		// TODO Auto-generated method stub
		return empMapper.findAllEmp();
	}

	@Override
	public void deleteEmpById(int id) {
		// TODO Auto-generated method stub
		empMapper.deleteEmpById(id);
	}

	@Override
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		int addEmp = empMapper.addEmp(emp);
		System.out.println("≤Â»Î∑µªÿ÷µ="+addEmp);
	}

	@Override
	public int update(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.update(emp);
	}

	@Override
	public Emp findEmpById(int id) {
		// TODO Auto-generated method stub
		return empMapper.findEmpById(id);
	}

}
