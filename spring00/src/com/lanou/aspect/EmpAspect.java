package com.lanou.aspect;

public class EmpAspect {
	/**��������*/
	public void beginTx(){
		System.out.println("ǰ��֪ͨ==>��������");
	}
	/**�ύ����*/
	public void commitTx(){
		System.out.println("����֪ͨ==>�ύ����");
	}
}
