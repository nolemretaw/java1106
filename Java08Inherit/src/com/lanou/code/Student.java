package com.lanou.code;
/*
 * �̳���һ��is a �Ĺ�ϵ
 * �̳е�����:
 * ���������е�����,˽�����Լ̳й�������ֱ�ӷ���,���ǿ���ͨ��setter, getter������
 * �͸�ֵ
 * ���������еķ������˹��췽�����ܼ̳�
 */
/*�̳е����ԭ��:
 * �����������Ի򷽷����ڸ�����,����ֻ��Ҫ�̳и���Ϳ��԰�
 * ��Щ���Ժͷ����õ�. ֻ����˽�����Բ�����ֱ�ӷ���,���ǿ���ͨ���̳�����setter, getter������
 * ������ֻ��Ҫ��д�Լ����е����Ժͷ����Ϳ���
 * �ŵ�:�������˴�����,ʹ��Ƹ�����
 * 
 * �̳е��﷨��ʽ:
 * ����  + extends + ����{}   
 */
/*	�̳е��ص㣺
 	1��û�и�������Ϊ���࣬Java�и�����Object
 	2���̳е��ϲ㣺����		�̳е��²㣺����
 	3���̳е����ݣ����еĳ�Ա����(˽�еĲ���ֱ�ӷ���)�ͷ���(���˹��췽��)
 	4��Java�еļ̳�Ϊ���̳У����� �����������ֻ��һ����
 	һ��������ж�����࣬����һ����ֻ����һ�����࣡
 	5���̳��ǵ���ģ������໥�̳�
 	6���̳��д����� Person Student CollegeStudent
 	��ѧ���̳�ѧ����ѧ���̳����࣬��ô��ѧ���;���ѧ����������������Ժͷ���
 	7��������������⸸��ķ���ʵ�֣�������д

 */
public class Student extends Person{
	private String id;
	private String classname;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	private void test() {
		System.out.println(getName());
	}
	
	
	
}
