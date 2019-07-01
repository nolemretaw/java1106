package com.lanou.code;

import java.util.Arrays;

public class Work {
	public static void bubbleSort(int[] arr){
		for (int i = 0;  i< arr.length-1 ; i++) {
			for (int j = 0; j < arr.length -i -1; j++) {
				if (arr[j+1]>arr[j]) {
					int temp =arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				} 
			}
		}
		
	}
	public static void main(String[] args) {
		// ц╟ещеепР
		int[] arr = {99, 88, 77 ,44 , 65, 557}; 
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
