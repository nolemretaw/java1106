package com.lanou.animal;

public class Animal {
	private String name;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Animal(){}
	
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public void eat() {
		System.out.println("�������ڳԶ���");
	}
	/*
	 * @Override��ʾ���·�������д����
	 */
	@Override
	/*toString()�����ڴ�ӡ����ʱ����,
	 * Ĭ�ϴ�ӡ�����������Լ���ַ,�����Ҫ��ӡ
	 * ���е�����ֵ,��Ҫ��toString()����������д
	 */
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]";
	}
	
}
