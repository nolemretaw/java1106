package com.tt.newcoder;

import java.util.Scanner;
import java.util.TreeSet;

public class Main3 {
/**
 * ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ�
 * �����ü����������N��1��1000֮������������N��1000����
 * ���������ظ������֣�ֻ����һ������������ͬ����ȥ����
 * ��ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣
 * ����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ���(ͬһ��������������ܻ��ж������ݣ�ϣ���������ȷ����)
 * */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int num = in.nextInt();
			TreeSet<Integer> set = new TreeSet<>();
			for (int i = 0; i < num; i++) {
				set.add(in.nextInt());
			}
			for (Integer integer : set) {
				System.out.println(integer);
			}
			
		}
	}
}
