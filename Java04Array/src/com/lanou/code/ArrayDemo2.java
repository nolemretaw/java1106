package com.lanou.code;

import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		/*
		 	数组中的元素,在只完成声明,初始化时,都是空值,想要对数组元素完成赋值,取值操作,都需要用到下标!!!
		 */
		/*
		 	创建数组时,通常有两种方式
		 	带初值,不带初值
		 */
		//不带初值,方便后续处理,根据需求来给数组中的元素赋值,是我们以后常用场景
		int[] nums = new int[6];
		float[] scores = new float[6];
		String[] names = new String[6];
		
		//带初值,推荐使用第一种,多个初值之间使用逗号隔开!!!
		//第二种形式,不能指定容量,带初值创建数组,容量根据初值的个数,自动给定
		int[] ages = {20, 30, 40, 50};			//推荐
		float[] heights = new float[]{185.0f, 114.0f, 330.0f};
		//不管带初值还是不带初值,数组创建时,容量必须确定,而且数组的容量直到销毁都不会改变
		/*
		 	不带初值
		 	数据类型[] 数组名 = new 数据类型[容量];
		 	int[] ages = new int[6];
		 	

		 	带初值
		 	数据类型[] 数组名 = {初值1, 初值2, ...}
		 	String[] names = {"孙悟空", "弼马温"}
		 */
		/*
		 	下标的范围是从0开始的,最大到数组容量减1
		 	一定要注意下标越界的问题
		 */
		names[0] = "孙悟空";
		names[1] = "齐天大圣";
		names[2] = "行走的CD";
		names[3] = "弼马温";
		names[4] = "孙行者";
		names[5] = "美猴王";
		System.out.println(Arrays.toString(names));
		/*
		 	空数组就是不带初值数组
		 	创建完会根据数据类型,来设置初值
		 	数值中整数为0,浮点数为0.0
		 	引用类型为null
		 */
		System.out.println(names[2]);
		/*
		 	通过下标赋值,取值的语法格式
		 	数组名[下标]
		 	names[2] = "行走的CD";
		 	System.out.println(names[2]);
		 	等号左边赋值,右边取值,需要根据语境来决定到底是赋值还是取值
		 */
		
		/*
		 	数组下标越界访问,会报异常
		 	ArrayIndexOutOfBoundsException
		 	所以说小心小心再小心
		 */
	}
}
