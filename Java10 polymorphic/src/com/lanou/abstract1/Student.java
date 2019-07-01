package com.lanou.abstract1;

public class Student extends Person {
	private String id;
	
	@Override
	public void smoking() {
		System.out.println("学生正在抽芙蓉王~");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String gender, String id) {
		super(name, gender);
		this.id = id;
	}
	
	
}
