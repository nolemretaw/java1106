package com.lanou.abstract1;

/*
	�������Ӧ�ó���
	1��ĳЩ����£�����ֻ֪������Ӧ�ð���ʲô�����������������������ʵ��
	Լ����������еķ��� 
	2���Ӷ��������ͬ��Ϊ�����г����һ�������࣬�������������Ϊ�����ģ��
	�Ӷ�������������Ƶ�������
*/
//ʹ��abstract����һ���࣬������Ϊ�����࣡
//1��ʹ��abstract�����������
//2��ʹ��abstract��������󷽷���ֻ��������û��ʵ�֣�û�д����ŵ�ʵ����
//3���������󷽷�����϶��ǳ�����
//4���������ڲ��������г��󷽷�Ҳ����û�У�Ҳ��������ͨ����
//5�������಻��ֱ��ʵ����(����)����  not new
/*
	6��һ����̳��˳�����,�������Ϊ�����࣬���Բ�ʵ�ּ̳еĳ��󷽷�
	���������ͨ�࣬�����ʵ�ֳ��󷽷�
*/
//7���������ڲ��ĳ��󷽷���������ʱ�����������private final static�ؼ���

public abstract class Person {
	
	private String name;
	private String gender;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Person() {
		
	}
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public abstract void smoking();
	
	public void study() {
		System.out.println("��������ѧϰ~");
	}
}





