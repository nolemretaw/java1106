package com.lanou.list;

import java.util.List;
import java.util.ArrayList;

public class ListDemo1 {
	public static void main(String[] args) {
		/*list �ӿ������������ڸ��ӿ�,��������,������Ԫ�ز���,�縳ֵ,ȡֵ,��ֵ,��ѯ��һϵ�в�������ø������
		 * �����ӿ�collection�ķ���ͬ������
		 */
		//����һ��list����
		List list = new ArrayList();
		//1.���Ԫ�ط���
		list.add("��ʿ��");
		list.add("��ë");
		list.add("�˸�");
		list.add("��ţ");
		System.out.println(list);
		//��ָ���±������Ԫ��
		list.add(1,"ţͷ��");
		System.out.println(list);
		//2.��ȡԪ�صķ���
		System.out.println(list.get(1));
		//3.ɾ��Ԫ�صķ���
		//ɾ���ƶ��±��µ�Ԫ��,�±겻��Խ��
		list.remove(3);
		System.out.println(list);
		//4.�޸ķ���
		list.set(1, "����");
		System.out.println(list);
		//5.��ȡԪ���±�
		/*indexOf�������ص���Ԫ����list�����еĵ�һ�����ֵ�λ��,��Ԫ�ز������򷵻�-1
		 */
		System.out.println(list.indexOf("����"));
		/*lastIndexOf�������ص���Ԫ����list�����е����һ�����ֵ�λ��,��Ԫ�ز������򷵻�-1
		 */
		System.out.println(list.lastIndexOf("��ţ"));
	}
}
