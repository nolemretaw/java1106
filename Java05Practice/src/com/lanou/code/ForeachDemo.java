package com.lanou.code;

public class ForeachDemo {

	public static void main(String[] args) {
		//
		int[] nums={2, 5, 6, 2, 5};
		/*
		 * for(数据类型 名称别名: 目标集合) {
		 * 		可以用别名来代之遍历到的内容
		 * }
		 * foreach遍历时,直接可以获取到集合中的内容,没有下标的概念,所以只需要获取内容时,
		 * 首选foreach; 如果遍历时需要用到下标,才用for
		 */
		for (int i : nums) {
			System.out.println(i);
		}
	}

}
