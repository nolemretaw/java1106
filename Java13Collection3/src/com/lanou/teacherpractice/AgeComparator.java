package com.lanou.teacherpractice;

import java.util.Comparator;

public class AgeComparator implements Comparator<Contact> {

	@Override
	public int compare(Contact o1, Contact o2) {
		Integer age1 = Integer.valueOf(o1.getAge());
		Integer age2 = Integer.valueOf(o2.getAge());
		return age2 - age1;
	}

}
