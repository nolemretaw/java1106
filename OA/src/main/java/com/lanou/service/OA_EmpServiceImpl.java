package com.lanou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.OA_Emp;
import com.lanou.mapper.OA_EmpMapper;

@Service(value="empService")
public class OA_EmpServiceImpl implements OA_EmpService {
	@Autowired
	private OA_EmpMapper empMapper;

	@Override
	public List<OA_Emp> findAllEmp() {
		
		return empMapper.findAllEmp();
	}

	@Override
	public void deleteEmpById(int id) {
		empMapper.deleteEmpById(id);
		
	}

	@Override
	public void addEmp(OA_Emp emp) {
		empMapper.addEmp(emp);
		
	}

	@Override
	public void updateEmp(OA_Emp emp) {
		empMapper.updateEmp(emp);
		
	}

	@Override
	public OA_Emp findEmpById(int id) {
		
		return empMapper.findEmpById(id);
	}
	

}
