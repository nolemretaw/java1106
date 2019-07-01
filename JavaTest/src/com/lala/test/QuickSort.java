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
	        //temp就是基准位,以arr[low]为基准
	        temp = arr[low];
	 
	        while (i<j) {
	            //先看右边，依次往左递减 <—— j
	        	//将右边比基准元素小的元素，放在基准元素左边，否则不变
	            while (temp<=arr[j]&&i<j) {//1、&&前面是确定比较元素大小，2、&&后面是确定递减范围
	                j--;
	            }
	            
	            //再看左边，依次往右递增 i ——>
	            //将左边比基准元素大的元素，放在基准元素右边，否则不变
	            while (temp>=arr[i]&&i<j) {//1、&&前面是确定比较元素大小，2、&&后面是确定递减范围
	                i++;
	            }
	            //如果满足条件则交换
	            if (i<j) {//当破坏条件1时，交换
	                t = arr[j];
	                arr[j] = arr[i];
	                arr[i] = t;
	            }
	 
	        }// while (i<j) 此时破坏条件，使i=j;
	        //最后将基准位与i和j相等位置的数字交换
	         arr[low] = arr[i];
	         arr[i] = temp;
	         
	        //递归调用左半数组
	        quickSort(arr, low, j-1);
	        
	        //递归调用右半数组
	        quickSort(arr, j+1, high);
	}
}
