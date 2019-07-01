package com.lanou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.Emp;
import com.lanou.mapper.EmpMapper;

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
		empMapper.addEmp(emp.getName(),emp.getSex(),emp.getJob(),
				emp.getSalary(),emp.getHiredate(),emp.getDeptno());
	}

	@Override
	public void update(Emp emp) {
		// TODO Auto-generated method stub
		empMapper.update(emp.getId(),emp.getName(),emp.getSex(),emp.getJob(),
				emp.getSalary(),emp.getHiredate(),emp.getDeptno());
	}

	@Override
	public Emp findEmpById(int id) {
		// TODO Auto-generated method stub
		return empMapper.findEmpById(id);
	}

}
