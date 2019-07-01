package com.lanou.dao;

import java.util.List;

import com.lanou.bean.Emp;

public interface EmpDao {
	public List<Emp> findAll();
	public Emp findEmpById(int id);
	public void addEmp(Emp emp);
	public void deleteEmpById(int id);
	public void updateEmp(Emp emp);
}
