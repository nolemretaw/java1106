package com.lanou.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lanou.annotation.MyBatisMapperAnnotation;
import com.lanou.bean.Emp;

/**ӳ��ӿ�*/
@MyBatisMapperAnnotation
@Repository("empMapper")
public interface EmpMapper {
	public List<Emp> findAllEmp();
	public void deleteEmpById(int id);
	
	
	
	
}




