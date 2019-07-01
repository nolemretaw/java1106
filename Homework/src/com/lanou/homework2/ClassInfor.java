package com.lanou.homework2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
/**
 * �ڵ��Դ����ϴ洢���ļ� student.txt
         �ļ����� 1001/����/�о�/90 ��ʽ�洢
         ѧ����id,����,����,����,ÿһ�д洢
         һ��,��ȡ�ļ������ݴ洢Map������
         map���ϵ�keyΪ���ұ��,valueΪ
        ���ұ����ͬ��ѧ������list����

 * */
public class ClassInfor {
	private static String txtName;//Ŀ���ļ�
	private static TreeMap<String,ArrayList<Student>> map;
	
	public static TreeMap<String, ArrayList<Student>> getMap() {
		return map;
	}
	public static void setMap(TreeMap<String, ArrayList<Student>> map) {
		ClassInfor.map = map;
	}
	public ClassInfor() {}
	public ClassInfor(String txtString) {
		txtName = txtString;
		map = new TreeMap<String, ArrayList<Student>>();
	}
	
	public static void readTxt() {
		FileReader reader = null;
		BufferedReader bR = null;
		try {
			reader = new FileReader(txtName);
			bR = new BufferedReader(reader);
			String line;
			while ((line = bR.readLine()) != null) {
				checkIn(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void checkIn(String line) {
		String temp = line.intern();// id / name / clssid / scorn
		String id = temp.substring(0,temp.indexOf("/")).intern();
		
		temp = temp.substring(temp.indexOf("/")+1).intern();
		String name = temp.substring(0,temp.indexOf("/")).intern();
		
		temp = temp.substring(temp.indexOf("/")+1).intern();
		String classId = temp.substring(0,temp.indexOf("/")).intern();
		
		temp = temp.substring(temp.indexOf("/")+1).intern();
		int score = Integer.parseInt(temp);
		Student student = new Student(id, name, classId, score);
		
		ArrayList<Student> list = map.get(student.getClassId());
		if (list == null) {
			list = new ArrayList<Student>();
			list.add(student);
			map.put(student.getClassId(), list);
		}else {
			list.add(student);
		}
	}
	
}
