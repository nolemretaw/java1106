package com.lanou.jdbc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Test6 {

	public static void main(String[] args) throws ParseException {
		EmpDao dao = new EmpDaoImpl();
		List<Emp> emps =dao.findAll();
		new EmpDaoImpl().findAll();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
//		System.out.println(dao.findEmpById(3));
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		String dateStr = "2019-1-1";
//		Date date = sdf.parse(dateStr);
//		dao.addEmp(new Emp(9, "ºú°ËÒ»", "ÄÐ", "×Ü²¿", 10000.00, date, 20));
//		System.out.println(dao.findEmpById(5));
	}

}
