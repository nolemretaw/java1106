package com.lanou.common;

public class StringDemo {

	public static void main(String[] args) {
		/*�ַ�������java.lang����,�������洢�ı���Ϣ��һ����
		 * �������Ժ��漰���ı�����ʱ�Ǳ������,ѧϰһ����,ϵͳ�ڲ���,
		 * ��Ҫѧϰ���Ƿ���
		 * 
		 */
		//���췽��
		String str = "Hello";
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = new String("Hello");
		System.out.println(str == str1);
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str2));
		/*equals���������Ƚ϶����Ƿ���ͬ
		 * Ĭ��ʵ���ǱȽϵ�ַ,���ַ����ڲ���equals������������д,��Ϊ�Ƚ�����,�����Ժ��ַ����Ƚ�ʱ
		 * ����equals����,����== ,�����Լ�������� �����ͨ���Ƚ����Ե�ֵ�Ƿ�һ�� ����ʾ�Ƿ����
		 * ,Ҳ���Զ�equals����������д
		 */
		//�ַ�������
		String string = "Hello World! Hello";
		System.out.println(string.length());
		//ȫ��д, ȫСд
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		//�ַ�����ȡ
		//�Ӵ����±꿪ʼһֱ�ص����,�ӿ�ʼ�±��ȡ,�������±�ǰһ��
		System.out.println(string.substring(6));
		System.out.println(string.substring(2, 5));
		//�ж���ʲôΪ��ͷ��β
		System.out.println(string.startsWith("Hel"));
		System.out.println(string.startsWith("?"));
		//�滻
		/*
		 * replaceAll���������ݽ�����Ҫ���滻�����ݽ����滻
		 * replaceFirstֻ����һ��Ҫ���滻������
		 */
		System.out.println(string.replaceAll("Hello", "hello"));
		System.out.println(string.replaceFirst("Hello", "shit"));
		//�ָ�
		String[] strs = string.split(" ");
		for(String s : strs) {
			System.out.println(s);
		}
	}
}
