package com.lanou.code;

import java.util.Arrays;

public class ArryDemo02 {

	public static void main(String[] args) {
		/*
		 * 数组中的元素,在只完成声明,初始化时都是空值
		 * 想要对数组元素进行赋值,取值操作,
		 * 都需要用到下标!!!
		 */
		/*
		 * 创建数组时通常有两种格式,
		 * 带初值 , 不带初值
		 * 不管带不带初值,数组创建时容量必须确定,而且数组的容量直到销毁
		 * 都不会发生改变
		 */
		/*
		 * 不带初值,方便后续处理,根据需求来给 数组元素赋值
		 */
		int[] nums=new int[5];
		float[] scores=new float[5];
		String[] names=new String[5];
		//多个初值之间使用逗号隔开   带初值创建数组,容量根据初值的个数,自动给定
		int[] ages={10, 20, 30, 40, 50};
		/*
		 * 带初值
		 * 数据类型[] 数组名= new 数据类型[容量];
		 * 不带初值
		 * 数据类型[] 数组名={初值1, 初值2}
		 */
		/*
		 * 下标的范围是从零开始的,最大到数组容量-1
		 * 一定要注意下标越界问题
		 */
		names[0]="晨晨";
		names[1]="小黄";
		names[2]="小明";
		names[3]="校长";
		names[4]="力宏";
		//不带初值的数组,创建完会根据数据类型来设置初值
		//数值中 整数为0 	浮点型为0.0	引用类型为null
		System.out.println(Arrays.toString(names));
		System.out.println(names[2]);
		/*
		 * 通过下标赋值,取值的语法的格式:
		 * 数组名[下标]
		 * names[2]="小黄"
		 * 
		 */
		System.out.println(names[5]);
	}
}
