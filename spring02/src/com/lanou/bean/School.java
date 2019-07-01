package com.lanou.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sch")
public class School {
	private Student student;
	private Teacher teacher;
	
	public void show(){
		student.show();
		teacher.show();
	}
	
	//byType按照类型来进行注入
	@Autowired
	//byName 强制按照名称来进行注入
	@Qualifier("stu1")
	public void setStudent(Student student) {
		this.student = student;
	}
	//byName 按照名称来进行注入
	//按照名称找不到就会按照类型来查找注入
	@Resource(name="tea1")//强制按照名称注入
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	public Student getStudent() {
		return student;
	}
	
}
