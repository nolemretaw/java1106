package com.lanou.dao;

import java.util.ArrayList;
import java.util.List;

import com.lanou.bean.Emp;

public class EmpDaoImpl implements EmpDao{
	@Override
	public List<Emp> findAll() {
		List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(1,"张三","123"));
		emps.add(new Emp(2,"李四","1234"));
		return emps;
	}
}



