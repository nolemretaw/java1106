package com.lanou.service;

import java.util.List;

import com.lanou.bean.Emp;

public interface EmpService {
	/**
	 * @return ����ҳ��
	 * */
	public int countPage(int pageSize);
	/**
	 * ����emp����ȫ������
	 * @return
	 */
	public List<Emp> findAll();
	/**
	 * ��ҳ��ѯ
	 * @param pageNum ��ѯҳ��
	 * @param pageSize ҳ��
	 * @return ��ѯҳ
	 * */
	public List<Emp> findPage(int pageNum,int pageSize);
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
