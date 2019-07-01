package com.lanou.teacherpractice;

import java.util.Comparator;

public class NameComparator implements Comparator<Contact> {

	@Override
	public int compare(Contact o1, Contact o2) {
		return PinYinUtil.getFullSpell(o1.getName()).compareTo(PinYinUtil.getFullSpell(o2.getName()));
	}

	
	
	
	
	
	
}
