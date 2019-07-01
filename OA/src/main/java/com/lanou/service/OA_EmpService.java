package com.lanou.service;

import java.util.List;

import com.lanou.bean.OA_Emp;

public interface OA_EmpService {
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
