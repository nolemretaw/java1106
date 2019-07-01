package com.lanou.test;

public class Student extends Person{
	private String id;
	private String classname;
	public void setId(String id) {
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getClassname(){
		return classname;
	}
	public Student(){}
	public Student(String name, int age, String gender, String id, String classname){
		super(name, age, gender);
		setId(id);
		setClassname(classname);
	}
	public String toString(){
		return "姓名: " + getName() + "年龄: " + getAge() + "性别: " + getGender()
		+ "学号: " + id + "班级: " + classname;   
	}
	public void study(){
		System.out.println(getName()+ "学习");
	}
}
