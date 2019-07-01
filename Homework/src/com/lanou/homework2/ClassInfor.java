package com.lanou.homework2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
/**
 * 在电脑磁盘上存储以文件 student.txt
         文件中以 1001/张三/研九/90 格式存储
         学生的id,姓名,教室,分数,每一行存储
         一个,读取文件中数据存储Map集合中
         map集合的key为教室编号,value为
        教室编号相同的学生对象list集合

 * */
public class ClassInfor {
	private static String txtName;//目标文件
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
