package com.lanou.set;

import java.util.LinkedHashSet;

public class LInkedHashSetDemo {

	public static void main(String[] args) {
		/*LinkedHashSet�������,���ڹ�ϣ��������ʵ�ֵ�
		 * HashSet����
		 * TreeSet��������Ϊ����Ȼ������
		 * LinkedHashSet������ָ���˳��,����ʵ���ǲ�ͬ����
		 */
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("����");
		set.add("ˮ��");
		set.add("������");
		set.add("С����");
		System.out.println(set);
	}

	
	
	
}

