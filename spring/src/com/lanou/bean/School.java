package com.lanou.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class School {
	private Student student;
	private Teacher teacher;
	private Date date;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.date = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void show() {
		student.show();
		teacher.show();
		System.out.println(date);
	}
	
}
