package com.lanou.week;

class A{
	public A(){
		System.out.println("---A()---");
	}
}
class B{
	public B(){
		System.out.println("---B()---");
	}
}
class M{
	public M(){
		System.out.println("---M()---");
	}
}
class N{
	public N(){
		System.out.println("---N()---");
	}
}

class Father{
	static{
		N n = new N();
	}
	/**�����ڹ�������֮ǰ��ʼ��
	 * ���ǿ��Գ�ʼ����ʱ��ֵ,
	 * Ҳ�����ڹ��������֮��ֵ
	 * */
	A a = new A();
	static M m = new M();
	public Father(){
		System.out.println("---Father()---");
	}
}

class Child extends Father{
	public Child(){
		System.out.println("---Child()---");
	}
	B b = new B();
	static N n = new N();
	static{
		M m = new M();
	}
}
/**
 * �������Ĺ�������
 * 1�����ظ���,Ϊ��������ڴ�ռ�
 * 2����˳����ظ���ľ�̬��Ա�����;�̬�����
 * 3����������,Ϊ��������ڴ�ռ�
 * 4����˳���������ľ�̬��Ա�����;�̬�����
 * 5����˳���ʼ����������(�Ǿ�̬��Ա����)
 * 6�����ø��๹���������������
 * 7����˳���ʼ����������
 * 8���������๹���������������
 */
public class Test4 {
	public static void main(String[] args) {
		Child c = new Child();
	}
}


