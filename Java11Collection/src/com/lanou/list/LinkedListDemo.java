package com.lanou.list;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("�׺���");
		list.add("�ں���");
		list.add("��Ȯ");
		list.add("��Դ");
		list.add("����");
		list.addFirst("·��");
		System.out.println(list);
		list.addLast("��¡");
		System.out.println(list);
		//�����б�ĵ�һ��Ԫ���Լ����һ��Ԫ��
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		//�Ƴ�������
		list.push("����");
		System.out.println(list);
		System.out.println(list.pop());
		/*ArrayList��LinkedList�������߳�ͬ����,���Բ��ܱ�����ͬʱ,����ɾ�����
		 * 
		 * ArrayList��LinkedList������:
		 * 1. ArrayList�ǻ��ڶ�̬����ʵ�ֵ�,��LinkedList�ǻ�������ʵ�ֵ�
		 * 2. ArrayList�����ɾ��ʱЧ�ʵ�,��ΪҪ�ƶ�����
		 * 3. LinkedList�ڻ�ȡ����ʱЧ�ʵ�,��ΪҪ�ƶ�ָ��,��֮,�����Ҫ���ɾ��ʱЧ�ʸ�
		 * 
		 */
	}
}