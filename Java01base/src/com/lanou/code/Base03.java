package com.lanou.code;

public class Base03 {

	public static void main(String[] args) {
		// ���������,����:ջ�� ; ����:������
/*
 * �����ڳ����ض�һ��,���ܷ����ı�
 * ������ջ��,��һ��洢�ռ�,�洢��ֵ���Է����ı�
 * �������� ������ = ��ֵ;
 * 
 * java�е��������ͷ�Ϊ����:
 * ������������;������������
 * 	������������:
 * 		����:
 * 			byte �ֽ���
 * 			short ������
 * 			int ����
 * 			long ������
 * 		������:
 * 			flout �����ȸ�����
 * 			double ˫���ȸ�����
 * 		�ַ���:
 * 			char
 * 		������:
 * 			boolean
 * 	������������:
 * 		��,����
 *  */
//		������������ʱ,��ֵһ��Ҫ����������ƥ��
		byte age = 28;
		short size = 100;
		int length = 2500000;
		long money = 111111111;
//		���Դ�ӡ����,�����������ʽ
		System.out.println("length = " + length);
//		�ַ���+��ֵ  ����ƴ��
//		����������������:
/*		1.������,��ĸ,�»���,$�������,�����ֲ��ܿ�ͷ
 * 		2.�����������ظ�����
 * 		3.������������ϵͳ�ڲ��Ĺؼ��ֻ��߱���������
 * 		4.����֪�����,�շ巨����
 * ��������ĸ��д,����������ĸСд,����������ĸСд
 */
//		������Ĭ����double��,����f����float��
//		����Ĭ����int��
		float score = 99.9f;
		double weight=98.9;
		char c = 'A';
		System.out.println(c + 10);
//		�������� boolean true false
		/*
		 �������͵ı�������is  can  has��ͷ
		 * 
		 */
		boolean isBoy = true;
		boolean hasMoney = true;
		boolean canFly = false;
	}

}