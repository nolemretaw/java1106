package com.lanou.mapper.master;

import java.sql.Date;
import java.util.List;

import com.lanou.annotation.MybatisAnnotation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lanou.bean.master.Emp;
import org.springframework.stereotype.Repository;

@Repository("empMapper")
public @MybatisAnnotation interface EmpMapper {
	public List<Emp> findAllEmp();

	public void deleteEmpById(int id);

	public void addEmp(Emp emp);

	public void update(Emp emp);

	public Emp findEmpById(int id);
}
