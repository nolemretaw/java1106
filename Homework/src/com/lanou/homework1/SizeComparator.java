package com.lanou.homework1;
import java.io.File;
import java.util.Comparator;
public class SizeComparator implements Comparator<File>{

	@Override
	public int compare(File o1, File o2) {
		if (o1.length()>=o2.length()) return 1;	
		return -1;
	}
}
