package com.lanou.code;

public class SignDemo {

	public static void main(String[] args) {
		// ��������� += -= *= /= %=
		int a=2;
		a +=10;
		/*
		 * ��ϵ,�߼������
		 * ��ϵ:> < >= <= == !=
		 * �ɹ�ϵ��������ӵı��ʽ����bool ����
		 * �߼�:&&  ||  !
		 * && and ���� �߼��� 
		 * ��&&���ӵı��ʽ��ҪΪ��,����Ҫ���� ���ʽ1 && ���ʽ2 ��Ϊ��  ����Ϊ��
		 * || or ���� �߼���
		 * ��|| ���ӵı��ʽ��ҪΪ��, ��ֻ����������һ�����ʽΪ�漴��
		 * 
		 */
		int num1 = 10, num2 = 9;
		boolean isTrue = num1 > num2 || num1-- > num2;
//		&&ͬ��Ϊ��,һ��Ϊ��
//		||ͬ��Ϊ��,һ��Ϊ��
		//��·����,boolean����
		System.out.println(isTrue);
		System.out.println(num1);
		System.out.println(num2);
	}

}
