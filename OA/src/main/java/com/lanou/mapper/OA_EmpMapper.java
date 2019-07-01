package com.lanou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lanou.bean.OA_Emp;
@Mapper
public interface OA_EmpMapper {
	//查询所有OA_Emp对象
	public List<OA_Emp> findAllEmp();
	//根据id删除一个对象
	public void deleteEmpById(int id);
	//添加一个OA_Emp对象
	public void addEmp(OA_Emp emp);
	//修改一个OA_Emp对象
	public void updateEmp(OA_Emp emp);
	//根据id查找OA_Emp对象
	public OA_Emp findEmpById(int id);
}
