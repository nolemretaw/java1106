package com.lanou.code;
import java.util.Arrays;
public class Homework01 {//��������,���Ԫ��,������ �ٺϲ���һ����������
	public static void main(String[] args) {
			int[] nums1={22, 33, 3, 2, 7};
			int[] nums2={34, 546, 45, 67, 4};
			int[] nums3=new int[10];
			System.out.println("����1Ϊ : "+Arrays.toString(nums1));
			for (int i = 0; i < nums1.length-1; i++) {//ð�ݹؼ�:����+����==������length-1
				for (int j = 0; j < nums1.length-i-1; j++) {
					if (nums1[j]>nums1[j+1]) {
						int temp=nums1[j+1];
						nums1[j+1]=nums1[j];
						nums1[j]=temp;
					}
				}		
			}
			System.out.println("����Ϊ :  "+ Arrays.toString(nums1)+"\n"+
					"����2Ϊ : "+Arrays.toString(nums2));
			for (int i = 0; i < nums2.length-1; i++) {//ð�ݹؼ�:����+����==������length-1
				for (int j = 0; j < nums2.length-i-1; j++) {
					if (nums2[j]>nums2[j+1]) {
						int temp=nums2[j+1];
						nums2[j+1]=nums2[j];
						nums2[j]=temp;
					}
				}
			}
			System.out.println("����Ϊ :  "+Arrays.toString(nums2));
			int i=0, j=0, k=0;//�㷨˼��:����֮ǰ�ֱ������,������һ����δ�������Ĳ���
			//,ֱ�ӽ������������,ʱ�临�Ӷ����ΪO(2n+m)
			while (i!=nums1.length && j!=nums2.length) {//���鶼û�б�����
				if (nums1[i]<nums2[j]) 
					nums3[k++]=nums1[i++];	
				
				else nums3[k++]=nums2[j++]; 
			}
			if (i==nums1.length) {//����1��������
				while (j!=nums2.length) {
					nums3[k++]=nums2[j++];
				}
			} else {//����2��������
				while (i!=nums1.length) {
					nums3[k++]=nums1[i++];
				}
			}
			System.out.println("�ܺ�����Ϊ :  "+Arrays.toString(nums3));
			}			
	}


