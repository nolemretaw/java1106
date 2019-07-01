package com.lanou.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
	public static void main(String[] args) {
		//����һ��Collection����
		Collection col = new ArrayList();
		//1. ���Ԫ��
		col.add("��������");
		col.add("������ʷ��");
		col.add("������³����");
		col.add("ĸҹ�������");
		System.out.println(col);
		//2. ���һ��Ԫ��
		Collection col1 = new ArrayList();
		col1.add("�󵶹�ʤ");
		col1.add("��������");
		col1.add("������¬����");
		col.addAll(col1);
//		System.out.println(col);
//		//3. ��ȡ������Ԫ�صĸ���
//		System.out.println(col.size());
//		//4. �ж��Ƿ����ĳ��Ԫ��
//		System.out.println(col.contains("��������"));
//		//5. �ж��Ƿ����һ��Ԫ��
//		System.out.println(col.containsAll(col1));
//		//6. ɾ�������е�ĳ��Ԫ��
//		col.remove("�󵶹�ʤ");
//		System.out.println(col);
//		//7. ɾ�������е�һ��Ԫ��
//		col.removeAll(col1);
//		System.out.println(col);
//		//8. ��ռ���
////		col.clear();
//		System.out.println(col);
//		//9. �жϼ����Ƿ�Ϊ��
//		System.out.println(col.isEmpty());
//		//���ϵı���
//		//1. foreach
//		for(Object object : col) {
//			if (object instanceof String) {
//				String string = (String)object;
//				System.out.println(string);
//			}
//		}
		//2. ���õ�����
		Iterator iterator = col.iterator();
		while (iterator.hasNext()) {
			Object object = (Object)iterator.next();
			if (object instanceof String) {
				String string = (String)object;
				System.out.println(string);
			}
		}
	}
}
