package com.lanou.bean;

import java.util.List;

public class TeaAndStu {
	private int id;
	private List<Teacher> teachers;
	private List<Student> students;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public TeaAndStu(int id, List<Teacher> teachers, List<Student> students) {
		super();
		this.id = id;
		this.teachers = teachers;
		this.students = students;
	}
	public TeaAndStu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
