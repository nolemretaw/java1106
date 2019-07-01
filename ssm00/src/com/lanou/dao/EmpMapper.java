package com.lanou.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lanou.annotation.MyBatisMapperAnnotation;
import com.lanou.bean.Emp;

@Repository("empMapper")
@MyBatisMapperAnnotation
public interface EmpMapper {
	public List<Emp> findAllEmp();
	public void deleteEmpById(int id);
	public int addEmp(Emp emp);
	public int update(Emp emp);
	public Emp findEmpById(int id);
	
}
