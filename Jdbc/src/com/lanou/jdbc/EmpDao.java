package com.lanou.jdbc;
/**DAO:Data Access Object
 * 	���ݷ��ʶ���
 * 	����ר�����ڷ�װ�������ݿ�Ĳ��������ͳ��������ݿ�֮�����϶�
 * */

import java.util.List;

public interface EmpDao {
	/**��ѯ��������*/
	public List<Emp> findAll();
	
	/**����ID��ѯĳ����¼*/
	public Emp findEmpById(int id);
	
	/**����IDɾ��ĳ����¼*/
	public int deleteEmpById(int id);
	
	/**����һ����¼*/
	public int addEmp(Emp emp);
	
	/**�޸�һ����¼*/
	public int updateEmp(Emp emp);
}
