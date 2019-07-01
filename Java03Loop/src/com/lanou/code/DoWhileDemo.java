package com.lanou.code;

public class DoWhileDemo {
	public static void main(String[] args) {
		//打印1-100之间所有的数字
		int num = 1;
		/*
		 	do...while循环尾部的分号不能省略!!!
		 	do {
		 		循环语句
		 	} while (循环条件);
		 	while (循环条件) {
		 		循环语句
		 	}
		 	区别:
		 	do...while循环,先执行语句在判断条件,所以语句的执行次数>=1
		 	while循环,先判断条件再执行语句,所以语句的执行次数>=0
		 	do...while很少用
		 */
		do {
			System.out.println(num);
			num++;
		} while (num < 101);
	}
}
