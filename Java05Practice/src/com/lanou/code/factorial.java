package com.lanou.code;

public class factorial {
	/*
	 * �����ڲ�����������ǵݹ�,�Լ������Լ�,
	 * ���Եݹ�һ��Ҫ�г���
	 */
	//��һ�����Ľ׳�
	public static long factorial(int num) {
		long f=1;
		while(num>0){
			f*=num--;
		}
		return f;
	}
	public static void main(String[] args) {
		

	}

}
