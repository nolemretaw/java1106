package com.lanou.code;

import com.lanou.entity.Student;
//�����������﷨
//import ����.����
/*
 * 1. һ�����в��������ͬ������
 * 2. ��ͬ�İ��п��Դ���ͬ������
 * 3. ��ͬһ�����е��������ʱ,��������������ͬ������,��ʹͬ�������ڲ�ͬ�İ���
 * 4. ���Ŀ�����ڵ�ǰ������ͬһ��������,���赼�뼴��ʹ��
 * 5. �����������뵱ǰ�����ڰ��е���ͬ��,����������ȼ�����
 */
public class Initial {
/*
 * �����Ҫ��һ������ͬʱʹ������ͬ������,������ڴ�������ʱ,ʹ��ȫ�޶���
 * ȫ�޶���: ����.����
 * ��ʱ����Ҫ��import����
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.lanou.dao.Student student = new com.lanou.dao.Student();
		student.sayHi();
		Teacher teacher = new Teacher();//���췽����, ������һ��
		teacher.name = "����Դ";
		teacher.gender = "��";
		teacher.age =28;
		teacher.salary = 500000.0f;
		teacher.smoke("�л�");
		teacher.watch("�߽���ѧ");
		teacher.teach();
	}

}
