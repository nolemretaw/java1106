package com.lanou.code;

public class DoblueArray {
	public static void main(String[] args) {
		/*
		 	�����ά�ȴ���һ���ռ䷶Χ
		 	int[] nums = new int[5]; һά����
		 */
		//�����������ڲ������ά�������,��
		//����ʱ,���Բ�ָ������,���������������! ��Ȼ����Ҳ����ָ��!!!
		int[][] nums = new int[5][5];
		/*
		 	��ά�������ʱ��Ҫ�õ�����ѭ��
		 	һ����Ʊ���������
		 	һ�����ÿһ�е�����
		 */
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = (int)(Math.random() * (20 - 10 + 1)) + 10;
			}
		}
		//��ά�����Ԫ��ʱһά����
		for (int[] is : nums) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
