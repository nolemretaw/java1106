package com.lanou.interview;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={1,3,8,20};
		int[] b ={2,3,11,12,15,26};
		int cLength = a.length+b.length;
		int[] c = new int[cLength];//和
		int repeat = 0;//重复个数
		int j = 0;
		int k = 0;
		for (int i =0; i < a.length; i++) {//遍历a
			if (j<b.length) {//b未遍历完			
				if (a[i]<b[j]) {
					c[k++]=a[i];
				}else if (a[i]>b[j]) {
					c[k++]=b[j++];
					i--;
				}else {//相等时
					c[k++]=a[i];
					j++;
					repeat++;
				}
			}else {//b遍历完了
				c[k++]=a[i];
			}
		}
		if (j<b.length) {//a遍历完了，b未遍历完
			for (; j < b.length; j++) {//遍历b
				c[k++]=b[j];
			}
		}
		for (int i=0;i<(cLength-repeat);i++) {
			System.out.println(c[i]);
		}
	}

}
