package com.lanou.code;

public class LoopControl {
	public static void main(String[] args) {
		/*
		 	ͨ��ѭ�����ƵĹؼ���,����ʵ����ѭ�������иı�ѭ����ִ������,�Ӷ��ﵽ������ѭ��������
		 	break  continue
		 */
		//��7,������һ����7�ı���ʱ,��ֹ��Ϸ
		int num = 1;
		while (true) {
			if (num % 7 == 0) {
				//��ֹѭ��
				break;
				/*
				 	break����ѭ���ڲ�,����������ֹѭ��,����ѭ��������������,Ҳ������ֹ
				 	��ֹ���Ǳ���ѭ��,breakд���ĸ�ѭ���ڲ���ֹ�ľ����Ǹ�ѭ��
				 */
			}
			System.out.println(num++);
		}
		
		
		//��ӡ1-100֮�������ĺ�
		/*num = 1;
		int sum = 0;
		while (num < 101) {
			if (num % 2 != 0){
				sum = sum + num; //sum += num;
			}
			num++;
		}
		System.out.println(sum);*/
		
		/*
		 	continue ��ֹ����ѭ��
		 	��ѭ������� continue֮��Ĵ����ڵ���ѭ���ж���ִ��!
		 */
		num = 0;
		int sum =0;
		while (num < 100) {
			num++;
			if (num % 2 == 0) {
				continue;
			}
			sum = sum + num;
		}
		System.out.println(sum);
	}
}

		/*
		 	break С���ȶ���
		 	continueС����
		 	�������ؼ�����ѭ����ʹ��ʱ,ͨ������if�������
		 */
