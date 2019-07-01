package com.lanou.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lanou.bean.Emp;

@Mapper
public interface EmpMapper {
	@Select("select * from emp")
	public List<Emp> findAllEmp();
	
	@Delete("delete from emp where id=#{id}")
	public void deleteEmpById(@Param("id") int id);
	
	@Insert("insert into emp(name,sex,job,salary,hiredate,deptno) values(#{name},#{sex},#{job},#{salary},#{hiredate},#{deptno})")
	public void addEmp(@Param("name") String name,@Param("sex") String sex,
			@Param("job") String job,@Param("salary") double salary,
			@Param("hiredate") Date hiredate,@Param("deptno") int deptno);
	
	@Update("update emp set name=#{name},sex=#{sex},job=#{job},salary=#{salary},hiredate=#{hiredate},deptno=#{deptno} where id=#{id}")
	public void update(@Param("id") int id,@Param("name") String name,@Param("sex") String sex,
			@Param("job") String job,@Param("salary") double salary,
			@Param("hiredate") Date hiredate,@Param("deptno") int deptno);
	
	@Select("select * from emp where id=#{id}")
	public Emp findEmpById(@Param("id") int id);
}
