package com.lanou.service;

import java.util.List;

import com.lanou.bean.OA_Emp;

public interface OA_EmpService {
		//��ѯ����OA_Emp����
		public List<OA_Emp> findAllEmp();
		//����idɾ��һ������
		public void deleteEmpById(int id);
		//���һ��OA_Emp����
		public void addEmp(OA_Emp emp);
		//�޸�һ��OA_Emp����
		public void updateEmp(OA_Emp emp);
		//����id����OA_Emp����
		public OA_Emp findEmpById(int id);
}
