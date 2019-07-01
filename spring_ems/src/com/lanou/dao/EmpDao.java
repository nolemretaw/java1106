package com.lanou.dao;

import java.util.List;

import com.lanou.bean.Emp;

public interface EmpDao {
	public List<Emp> findAll();
	public void addEmp(Emp emp);
}
