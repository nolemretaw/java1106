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
//		//this在前升序,this在后降序
//				//this.xx - o.xx 大于0,放在集合尾部,小于0,放在集合头部
//				int var = this.name.compareTo(o.getName());
//				if (var == 0) {
//					var = o.age - this.age;
//					if (var == 0) {
//						var = this.id - o.id;
//					}
//				}
//				return var;
//	}
	//先按姓名升序 再按照年龄降序 再按照id升序
	public int compareTo(Student o){
		int var = this.name.compareTo(o.getName());//若<0,则前面的元素小,将前面的放入头部,若>0,则前面的元素大,将前面的
		//元素放入尾部
		if (var == 0) {
			var = o.age - this.age;//目标比o小,返回正数,将目标放入尾部,目标比o大,返回负数,将o放入尾部
			if (var == 0) {
				var = this.id - o.id;//目标比o大,则将目标放入尾部,目标比o小,则把o放在尾部
			}
		}
		return var;
	}
	
	
	
	
	
	
	
}
