package com.lanou.lsp_�����滻2;

import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
		// ������ڵĵط�������Ҳ�ܴ���
		/**������β�(С)��һ��HashMap,������β�(��)��Map�����βγ�Ϊǰ������
		 * ������β�����ڸ��෶Χ�����,������游�࣬����ķ�������ִ��
		 **/
//		Father father = new Father();
		Son father = new Son();
		HashMap map = new HashMap();
		//�����ഫһ�������βη�Χ���,
		father.doSomthing(map);
	}

}
