package com.lanou.code;

import java.lang.reflect.Array;

public class ArryDemo01 {

	public static void main(String[] args) {
		/*数组:
		 * 一组数据,可以实现对数据的统一管理,在数据量大的时候,
		 * 操作管理比较方便,其实数组相当于一个容器,
		 * 容器内部存放我们需要的数据
		 * 1. 如何声明数组
		 * 2. 如何对数组进行初始化
		 * 3. 如何赋值,取值
		 * 4. 下标越界问题
		 * 5. 如何对数组进行遍历
		 * 
		 * 声明数组的语法格式
		 * 		1 数组类型[] 数组名
		 * 		2 数据类型 数组名[]
		 * 数组声明时,给定的数据类型,一定要与赋值的数据,类型一致
		 * 		
		 */
		int[] nums;
		double scores[];
		String[] names;
		/*对数组进行初始化,开辟空间
		 * 初始化的语法格式:
		 * new 数据类型[数组容量]
		 * 而所谓容量,就是内部存储数据的个数
		 * 一定要在初始化时给定,否则开辟的大小无法确定
		 */
		nums = new int[9];
		//Array导包
		//new出来的真正的数组对象,在堆区; 数组名nums在栈区内指向数组
		//new 根据"类"(模板)创建一个抽象,由变量"对象"执行成具象
//		int[] arr;
//		arr={1,2,3};错误
		
		int arr1[];
		arr1 = new int[]{1,2};
		
		int arr2[][]=new int[][]{{1,2},{2,3}};
		
		int [][]arr3=new int[][]{{2,3},{3,4}}; 
	}

}
