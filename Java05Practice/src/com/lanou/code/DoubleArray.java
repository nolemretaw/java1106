package com.lanou.code;

public class DoubleArray {

	public static void main(String[] args) {
		// �����ά��
		int[] nums = new int[5];
		int[][] nums1 = new int[5][5];
		/*
		 *�����ά����ʱ,��������ָ��,�������Բ�ָ��
		 */
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums1[i].length; j++) {
				nums1[i][j] = (int)(Math.random()*(20-10+1))+10;
			}
		}
		/*
		 * ��ά�����ڱ���ʱ,��Ҫ�õ�����ѭ��,
		 * һ����Ʊ���������
		 * һ����Ʊ���ÿһ�е�����
		 */
		for (int[] is : nums1) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
