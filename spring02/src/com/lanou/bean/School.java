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
	
	//byType��������������ע��
	@Autowired
	//byName ǿ�ư�������������ע��
	@Qualifier("stu1")
	public void setStudent(Student student) {
		this.student = student;
	}
	//byName ��������������ע��
	//���������Ҳ����ͻᰴ������������ע��
	@Resource(name="tea1")//ǿ�ư�������ע��
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
