package com.lanou.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("�����");
		/*�������߳�ͬʱ����һ��ArrayListʵ��,����������һ���̴߳ӽṹ���޸����б�,�ṹ�ϵ�
		 * �޸���ָ�κ���ӻ�ɾ��һ������Ԫ�صĲ���,��ʱ�ͻ��׳��쳣
		 */
		/*����Ժ���Ҫ�ڱ���list����ʱ,����ṹ�����޸�,����forѭ��
		 * �����ֻ�������Ԫ�ؽ��б���,�Ͳ���foreach�������
		 * 
		 * ArrayList��ʵ�ֲ����߳�ͬ����,�߳��ǲ���ȫ��,ͬһʱ������߳̿���ͬʱ����ͬһ��AtrraysListʵ��
		 */
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("������")) {
				list.add("��ʦ��");
			}	
			System.out.println(list.get(i));
		}	
		
	}
}
