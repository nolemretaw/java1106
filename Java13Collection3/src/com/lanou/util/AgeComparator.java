package com.lanou.util;

import java.util.Comparator;

public class AgeComparator implements Comparator<Contact>{

	@Override
	public int compare(Contact o1, Contact o2) {
		return o2.getAge() - o1.getAge();
	}

}
