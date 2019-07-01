package com.lanou.polymorphic;

public class Initial {
	public static void main(String[] args) {
		Leader leader = new Leader();
		H5Teacher h5Teacher = new H5Teacher();
		JavaTeacher javaTeacher = new JavaTeacher();
		leader.watch(h5Teacher);
		leader.watch(javaTeacher);
	}
}
