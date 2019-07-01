package com.lanou.teachHomework;
import java.io.File;
import java.util.Comparator;
public class NameComparator implements Comparator<File>{
//ÉýÐò
	@Override
	public int compare(File o1, File o2) {
		String fileNameStrO1 = o1.getName();
		String fileNameStrO2 = o2.getName();
		int lastPIndex = fileNameStrO1.lastIndexOf(".") + 1;//Ä©Î²µã
		
		if (Integer.parseInt(fileNameStrO1.substring(lastPIndex))
				>Integer.parseInt(fileNameStrO2.substring(lastPIndex))) 
		return 1;	
		return -1;
	}
}