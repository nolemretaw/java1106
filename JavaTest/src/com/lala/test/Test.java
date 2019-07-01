package com.lala.test;

public class Test {

	public static void main(String[] args) {
		int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
		quickSort(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	private static void quickSort(int[] arr, int low, int high) {
		int i,j,tmp,t;
		if (low>high) {
			return;
		}
		i = low;
		j = high;
		tmp = arr[low];
		while (i<j) {
			while (i<j&&arr[j]>=tmp) {
				j--;
			}
			while (i<j&&arr[i]<=tmp) {
				i++;
			}
			if (i<j) {
				t = arr[j];
				arr[j]=arr[i];
				arr[i]=t;
				
			}
		}
		arr[low]=arr[i];
		arr[i] = tmp;
		
		quickSort(arr, low, j-1);
		quickSort(arr, i+1, high);
	}

}
