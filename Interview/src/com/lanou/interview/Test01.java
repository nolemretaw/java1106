package com.lanou.interview;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={1,3,8,20};
		int[] b ={2,3,11,12,15,26};
		int cLength = a.length+b.length;
		int[] c = new int[cLength];//��
		int repeat = 0;//�ظ�����
		int j = 0;
		int k = 0;
		for (int i =0; i < a.length; i++) {//����a
			if (j<b.length) {//bδ������			
				if (a[i]<b[j]) {
					c[k++]=a[i];
				}else if (a[i]>b[j]) {
					c[k++]=b[j++];
					i--;
				}else {//���ʱ
					c[k++]=a[i];
					j++;
					repeat++;
				}
			}else {//b��������
				c[k++]=a[i];
			}
		}
		if (j<b.length) {//a�������ˣ�bδ������
			for (; j < b.length; j++) {//����b
				c[k++]=b[j];
			}
		}
		for (int i=0;i<(cLength-repeat);i++) {
			System.out.println(c[i]);
		}
	}

}
