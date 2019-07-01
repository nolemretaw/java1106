package com.lanou.dao;
/**
 * ��װ����emp��Ĳ���
 */

import java.sql.ResultSetMetaData;
import java.util.List;

import com.lanou.bean.Emp;

public interface EmpDao {
	/**
	 * ����emp����ȫ������
	 * @return
	 */
	public List<Emp> findAll();
	/**
	 * ����idɾ��һ�м�¼
	 * @param id
	 * @return
	 */
	public boolean deleteById(int id);
	/**
	 * ����emp���������ݱ������һ�м�¼
	 * @param emp
	 * @return
	 */
	public boolean addEmp(Emp emp);
	/**
	 * �޸�emp����
	 * @param emp
	 * @return
	 */
	public boolean updateEmp(Emp emp);
	/**
	 * ����id����һ��emp��¼����װ��emp����
	 * @param id
	 * @return
	 */
	public Emp findEmpById(int id);
	/**
	 * ��ȡԪ���ݽ��������������
	 * 
	 * */
	public List<String> getRsmd();
	
}
