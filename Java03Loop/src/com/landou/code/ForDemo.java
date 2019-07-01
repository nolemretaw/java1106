package com.landou.code;

public class ForDemo {

	public static void main(String[] args) {
/*
 * 循环变量的初始化
 * 循环条件
 * 循环增量
 * 循环语句 
 */		
		int sum=0;
		int max=0, min=100;
		for (int i = 0; i < 10; i++) {
			int num=(int)(Math.random()*(20-10+1))+10;
			System.out.print(num+ " ");
			sum+=num;
			max=max>num?max:num;
			min=min<num?min:num;
		}
		System.out.println("\n"+sum);
		System.out.println(min);
		System.out.println(max);
	}
}
