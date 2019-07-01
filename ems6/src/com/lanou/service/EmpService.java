package com.lanou.service;

import java.util.List;

import com.lanou.bean.Emp;

public interface EmpService {
	/**
	 * @return 表中页数
	 * */
	public int countPage(int pageSize);
	/**
	 * 查找emp表中全部数据
	 * @return
	 */
	public List<Emp> findAll();
	/**
	 * 分页查询
	 * @param pageNum 查询页码
	 * @param pageSize 页容
	 * @return 查询页
	 * */
	public List<Emp> findPage(int pageNum,int pageSize);
	/**
	 * 根据id删除一行记录
	 * @param id
	 * @return
	 */
	public boolean deleteById(int id);
	/**
	 * 根据emp对象向数据表中添加一行记录
	 * @param emp
	 * @return
	 */
	public boolean addEmp(Emp emp);
	/**
	 * 修改emp对象
	 * @param emp
	 * @return
	 */
	public boolean updateEmp(Emp emp);
	/**
	 * 根据id查找一行emp记录，封装成emp对象
	 * @param id
	 * @return
	 */
	public Emp findEmpById(int id);
	/**
	 * 获取元数据结果集列名、列数
	 * 
	 * */
	public List<String> getRsmd();
}
