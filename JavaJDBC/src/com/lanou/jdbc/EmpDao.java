package com.lanou.jdbc;
/**DAO:Data Access Object
 * 	数据访问对象
 * 	该类专门用于封装访问数据库的操作，降低程序与数据库之间的耦合度
 * */

import java.util.List;

public interface EmpDao {
	/**查询所有数据*/
	public List<Emp> findAll();
	
	/**根据ID查询某条记录*/
	public Emp findEmpById(int id);
	
	/**根据ID删除某条记录*/
	public int deleteEmpById(int id);
	
	/**插入一条记录*/
	public int addEmp(Emp emp);
	
	/**修改一条记录*/
	public int updateEmp(Emp emp);
}
