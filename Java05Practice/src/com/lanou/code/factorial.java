package com.lanou.code;

public class factorial {
	/*
	 * 方法内部调用自身就是递归,自己调用自己,
	 * 所以递归一定要有出口
	 */
	//求一个数的阶乘
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
