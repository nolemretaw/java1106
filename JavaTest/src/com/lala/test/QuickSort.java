package com.lala.test;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
		quickSort(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}

	private static void quickSort(int[] arr, int low, int high) {
		 int i,j,temp,t;
	        if(low>high){
	            return;
	        }
	        i=low;
	        j=high;
	        //temp���ǻ�׼λ,��arr[low]Ϊ��׼
	        temp = arr[low];
	 
	        while (i<j) {
	            //�ȿ��ұߣ���������ݼ� <���� j
	        	//���ұ߱Ȼ�׼Ԫ��С��Ԫ�أ����ڻ�׼Ԫ����ߣ����򲻱�
	            while (temp<=arr[j]&&i<j) {//1��&&ǰ����ȷ���Ƚ�Ԫ�ش�С��2��&&������ȷ���ݼ���Χ
	                j--;
	            }
	            
	            //�ٿ���ߣ��������ҵ��� i ����>
	            //����߱Ȼ�׼Ԫ�ش��Ԫ�أ����ڻ�׼Ԫ���ұߣ����򲻱�
	            while (temp>=arr[i]&&i<j) {//1��&&ǰ����ȷ���Ƚ�Ԫ�ش�С��2��&&������ȷ���ݼ���Χ
	                i++;
	            }
	            //������������򽻻�
	            if (i<j) {//���ƻ�����1ʱ������
	                t = arr[j];
	                arr[j] = arr[i];
	                arr[i] = t;
	            }
	 
	        }// while (i<j) ��ʱ�ƻ�������ʹi=j;
	        //��󽫻�׼λ��i��j���λ�õ����ֽ���
	         arr[low] = arr[i];
	         arr[i] = temp;
	         
	        //�ݹ�����������
	        quickSort(arr, low, j-1);
	        
	        //�ݹ�����Ұ�����
	        quickSort(arr, j+1, high);
	}
}
