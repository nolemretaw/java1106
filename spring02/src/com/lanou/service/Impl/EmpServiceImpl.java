package com.lanou.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.bean.Emp;
import com.lanou.dao.EmpDao;
import com.lanou.service.EmpService;
/**
 * 注册业务层service组件到容器
 * */
@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao empDao;
	@Override
	public List<Emp> findAll() {
		return empDao.findAll();
	}
	public EmpDao getEmpDao() {
		return empDao;
	}
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	@Override
	public void insert(Emp emp) {
		/*int[] array ={1,2,3};
		array[5]=1;
		String s = null;
		s.length();*/
		//开启事物
		empDao.addEmp(emp);
		System.out.println("插入数据");
		//提交事物
	}

}
