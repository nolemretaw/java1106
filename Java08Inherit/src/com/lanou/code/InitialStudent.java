package com.lanou.code;

public class InitialStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student = new Student();
//		student.setName("»ÆÐù");
//		student.setAge(20);
//		student.setGender("ÄÐ");
//		student.setId("2345");
//		student.setClassname("Xa123456");
//		System.out.println(student.getName());
//		System.out.println(student.getAge());
//		System.out.println(student.getGender());
//		System.out.println(student.getId());
//		System.out.println(student.getClassname());
		CollegeStudent collegeStudent = new CollegeStudent();
		collegeStudent.setName("»ÆÐù");
		collegeStudent.setAge(20);
		collegeStudent.setGender("ÄÐ");
		collegeStudent.setId("2345");
		collegeStudent.setClassname("Xa123456");
		collegeStudent.setMajor("computer");
		System.out.println(collegeStudent.getName());
		System.out.println(collegeStudent.getAge());
		System.out.println(collegeStudent.getGender());
		System.out.println(collegeStudent.getId());
		System.out.println(collegeStudent.getClassname());
		System.out.println(collegeStudent.getMajor());
	}

}
