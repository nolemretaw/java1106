package com.lanou.test;

public class Initial {

	public static void main(String[] args) {
		Leader leader = new Leader();
		H5Teacher h5Teacher = new H5Teacher();
		JavaTreacher javaTreacher  = new JavaTreacher();
		leader.watch(javaTreacher);
		leader.watch(h5Teacher);

	}

}
