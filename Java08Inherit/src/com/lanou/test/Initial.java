package com.lanou.test;

import java.util.Arrays;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("htr",23,"fale");
		person.eat();
		Student student = new Student("htr", 23, "fale","123","456");
		student.study();
		System.out.println(person.toString());
		System.out.println(student.toString());
	}

}
