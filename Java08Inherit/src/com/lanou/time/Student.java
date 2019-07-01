package com.lanou.time;

public class Student extends Person {
	private int id;//Ñ§ºÅ
	private String classname;//°àÃû
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String classname() {
		return classname;
	}
	public Student() {
		super();
	}
	public Student(String name, int age, String gender, int id, String classname) {
		super(name, age, gender);
		this.id = id;
		this.classname = classname;
	}
	public String toString() {
		return "Student [id=" + id + ", classname=" + classname + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", setGender()=" + setGender() + "]";
	}
	
}
