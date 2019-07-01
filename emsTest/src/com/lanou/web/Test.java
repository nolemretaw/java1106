package com.lanou.web;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;

import jdbc.DaoFactory;

public class Test {
	public static void main(String[] args) {
	try {
		EmpDao dao = (EmpDao) DaoFactory.getDao("empDao").newInstance();
		Emp emp = new Emp();
		emp.setId(18);
		emp.setName("уехЩ");
		emp.setAge(100);
		emp.setSalary(1999);
		dao.updateEmp(emp);
	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
