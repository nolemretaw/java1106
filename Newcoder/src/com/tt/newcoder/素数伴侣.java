package com.tt.newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ËØÊý°éÂÂ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while ((str = br.readLine())!=null) {
			int n = Integer.parseInt(str);
			long[] arr =  new long[n];
			String[] numStr = br.readLine().split(" ");
			for (int i = 0; i < numStr.length; i++) {
				arr[i] = Integer.parseInt(numStr[i]);
			}
			
			ArrayList<Long> evens =  new ArrayList<Long>();
			ArrayList<Long> odds = new ArrayList<Long>();
			for (int i = 0; i < n; i++) {
				if (arr[i]%2==0) {
					evens.add(arr[i]);
				}else {
					odds.add(arr[i]);
				}
			}
			
			System.out.println(odds.size()>evens.size()?evens.size():odds.size());
			
		}
	}

}
