package com.lanou.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>();
		set.add(new Student("zhangsan",18,1));
		set.add(new Student("lisi",9,10));
		set.add(new Student("wangermazi",38,4));
		set.add(new Student("zhangerlvzi",11,9));
		System.out.println(set);
		System.out.println("zhangsan".compareTo("zhangsan0"));
		/*TreeSet�ṩ��Ĭ�ϵ���Ȼ������,�Լ�Ԫ�ز��ظ�����,��ʽ���õ���Compareble�е�compareTo����
		 * TreeSet�ӿ��еķ���������Ȼ������
		 * �˷����ķ���ֵΪ����,���Ϊ0,�����Ԫ���ظ�,��ʱԪ�ز�����ӵ�Treeset������,
		 * �������ֵ��Ϊ0,����0����ǰ���Ԫ�ش�,��ŵ����ϵ�ĩβ,��С��0,����ǰ���Ԫ��С,��ŵ�ͷ��
		 * 
		 * TreeSet�����򼯺�,����ʵ���ǲ�ͬ����
		 */
	}

}
