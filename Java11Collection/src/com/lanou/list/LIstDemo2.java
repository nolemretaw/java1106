package com.lanou.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LIstDemo2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("��");
		list.add("�ڽ�");
		System.out.println(list);
		//foreach,���������Ƕ�̬����
		//1.foreach
		for(Object object : list){
			if (object instanceof String) {
				String string = (String)object;
				System.out.println(string);
			}
		}
		//2.������
		Iterator iterator =list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			if (object instanceof String) {
				String string = (String)object;
				System.out.println(string);
			}	
		}
		//3.List������
		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Object object = (Object) listIterator.next();
			if (object instanceof String) {
				String string = (String)object;
				System.out.print(string + " ");
			}	
		}
		//4.forѭ��
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
