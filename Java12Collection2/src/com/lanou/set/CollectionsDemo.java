package com.lanou.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("zhangsan", 18 ,1));
		list.add(new Student("lisi", 38 ,10));
		list.add(new Student("wangermazi", 20 ,9));
		list.add(new Student("zhangerlvzi", 14 ,3));
		//1. ��ת
		Collections.reverse(list);
		System.out.println(list);
		//2. ϴ��
		Collections.shuffle(list);
		System.out.println(list);
		//3. ����
		Collections.sort(list);
		System.out.println(list);
		
		IdComparator idComparator =new IdComparator();
		Collections.sort(list, idComparator);
		System.out.println(list);
		/*
	 	TreeSetĬ��������Ĺ��ܣ���List�ӿ�û��
	 	Collections��������չ��List�ӿ�������Ĺ���
	 	TreeSet��Collections.sort(list���϶���(һ������))
	 	Ĭ�ϲ��õĶ�����Ȼ����
	 	��Ȼ����
	 	����Ҫ��������ڲ�ʵ��Comparable�ӿڣ���ʵ��compareTo����
	 	���������ƶ����ǵ����򷽰�������ʵ���ۺ����򣬵�ʵ�ֵ�һ����ʱ��ֻ���޸�Դ����
	 	
	 	��һ���򣬽����Ƚ�����
	 	����Ҫ����Ҫ��������ڲ���ʲô������ֻ��Ҫ �����Ƚ����� ʵ��Comparator�ӿ�
	 	��ʵ��compare���������������ƶ���һ�����򷽷���������߽���
	 	Collections.sort
	 */
	}

}
