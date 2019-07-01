package com.lanou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lanou.bean.OA_Emp;
@Mapper
public interface OA_EmpMapper {
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
