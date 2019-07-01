package com.lanou.practive;

public class Initial {
	public static void main(String[] args) {
		Leader leader = new Leader();
		H5Teacher teacher = new H5Teacher();
		JavaTeacher teacher2 = new JavaTeacher();
		leader.watch(teacher);
		leader.watch(teacher2);
	}
}
