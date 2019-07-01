package com.lanou.practice;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int id;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(){}
	public Student(String name, int age, int id){
		super();
		setName(name);
		setAge(age);
		setId(id);
	}
	public String toString(){
		return " name: "+name+"age: "+age+"id: "+id;
	}
//	public int compareTo(Student o){
//		//this��ǰ����,this�ں���
//				//this.xx - o.xx ����0,���ڼ���β��,С��0,���ڼ���ͷ��
//				int var = this.name.compareTo(o.getName());
//				if (var == 0) {
//					var = o.age - this.age;
//					if (var == 0) {
//						var = this.id - o.id;
//					}
//				}
//				return var;
//	}
	//�Ȱ��������� �ٰ������併�� �ٰ���id����
	public int compareTo(Student o){
		int var = this.name.compareTo(o.getName());//��<0,��ǰ���Ԫ��С,��ǰ��ķ���ͷ��,��>0,��ǰ���Ԫ�ش�,��ǰ���
		//Ԫ�ط���β��
		if (var == 0) {
			var = o.age - this.age;//Ŀ���oС,��������,��Ŀ�����β��,Ŀ���o��,���ظ���,��o����β��
			if (var == 0) {
				var = this.id - o.id;//Ŀ���o��,��Ŀ�����β��,Ŀ���oС,���o����β��
			}
		}
		return var;
	}
	
	
	
	
	
	
	
}
