package com.lanpu.map;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override//thisÔÚÇ°½µĞò
	public int compareTo(Student o) {
		int var = o.name.compareTo(this.name);
		if (var == 0) {
			var = this.age - o.age;
		}
		return var;
	}
}
