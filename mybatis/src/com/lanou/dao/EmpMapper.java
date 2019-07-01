package com.lanou.dao;

import java.util.List;

import com.lanou.bean.Emp;

public interface EmpMapper {
	public Emp findEmpById(int id);
	public void deleteEmpById(int id);
	public void addEmp(Emp emp);
	public void updateEmp(Emp emp);
	public List<Emp> findAll();
}
