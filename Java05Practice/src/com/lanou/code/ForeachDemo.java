package com.lanou.code;

public class ForeachDemo {

	public static void main(String[] args) {
		//
		int[] nums={2, 5, 6, 2, 5};
		/*
		 * for(�������� ���Ʊ���: Ŀ�꼯��) {
		 * 		�����ñ�������֮������������
		 * }
		 * foreach����ʱ,ֱ�ӿ��Ի�ȡ�������е�����,û���±�ĸ���,����ֻ��Ҫ��ȡ����ʱ,
		 * ��ѡforeach; �������ʱ��Ҫ�õ��±�,����for
		 */
		for (int i : nums) {
			System.out.println(i);
		}
	}

}
