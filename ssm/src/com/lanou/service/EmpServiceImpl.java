package com.lanou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpMapper;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpMapper empMapper;
	@Override
	public List<Emp> findAll() {
		return empMapper.findAllEmp();
	}
	@Override
	public void deleteEmpById(int id) {
		empMapper.deleteEmpById(id);
	}
}
