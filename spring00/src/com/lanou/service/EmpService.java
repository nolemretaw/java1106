package com.lanou.service;

import java.util.List;

import com.lanou.bean.Emp;

public interface EmpService {
	public List<Emp> findAll();
	public Emp findEmpById(int id);
	public void insert(Emp emp);
	public void deleteEmpById(int id);
	public void updateEmp(Emp emp);
}
