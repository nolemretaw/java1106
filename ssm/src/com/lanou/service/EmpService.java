package com.lanou.service;

import java.util.List;

import com.lanou.bean.Emp;

public interface EmpService {
	public List<Emp> findAll();
	public void deleteEmpById(int id);
}




