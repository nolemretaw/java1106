package com.landou.code;

public class LoopCtrl {

	public static void main(String[] args) {
		/*
		 * ͨ��ѭ�����ƵĹؼ��ֿ���ʵ����ѭ���Ĺ�����,�ı�ѭ����ִ������,�Ӷ��ﵽ������ѭ��������
		 * break  continue
		 */
		//"��7��"
		int num = 1;
		while (true) {
			if (num % 7 == 0) {
				break;
				/*
				 * break����ѭ���ڲ�,����������ֹ!�˲�!ѭ��
				 */
			}
			System.out.print((num++) +" ");
		}
			
			//��ӡ1~100֮�������ĺ�
		num=0;
		int sum=0;	
		while (num<100) {
			num++;
			if (num%2==0) {
				continue;
				/*
				 * continue��ֹ!����!ѭ��,��ѭ�������continue֮��Ĵ����ڱ���ѭ���ж���ִ��
				 */
			}
			sum+=num;
			/*
			 * break  continue �������ؼ���ͨ������if����
			 */
		}
		System.out.println(sum);
	}

}
