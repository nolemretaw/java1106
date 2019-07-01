package com.lanou.teachHomework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*读取学生信息，存入集合
 * */
public class 学生记录 {

	public static void main(String[] args) throws Exception{
		// 1、构建输入流读取数据
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("src/students.txt")));
		//2、循环读取每一行数据
		//将每一行数据解析成一个student对象
		//将所有的student对象存入list集合
		List<Student> students = new ArrayList<>();
		String line;
		while((line=br.readLine())!=null){
			if (line.equals("")) {
				Student student = parseLIneToStudent(line);
				students.add(student);
			}	
			br.close();
		}
		//定义map集合
		//key:classRoom班级号
		//value：classRoom相同的学生list集合
		Map<String,List<Student>> map = new HashMap<>();
		for (Student stu : students) {
			//取出每个学生的classRoom
			String classRoom = stu.getClassroom();
			//将classRoom当做key去获取value值
			List<Student> list = map.get(classRoom);
			if (list==null) {//第一次出现该班级的学生
				list = new ArrayList<>();
			}
			list.add(stu);
			map.put(classRoom, list);
		}
		//遍历map集合
		Set<Entry<String, List<Student>>> set = map.entrySet();
		for (Entry<String, List<Student>> entry : set) {
			System.out.println(entry.getKey()+entry.getValue());
		}
	}
	
	/**将数据解析成一个student对象
	 * */
	private static Student parseLIneToStudent(String line) {
		String[] array = line.split("/");
		return new Student(array[0],array[1],array[2],Integer.parseInt(array[3]));
	}
	static class Student implements Serializable{//序列化，将对象序列化为字节
		private String id;
		private String name;
		private String classroom;
		private int score;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getClassroom() {
			return classroom;
		}
		public void setClassroom(String classroom) {
			this.classroom = classroom;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public Student(String id, String name, String classroom, int score) {
			super();
			this.id = id;
			this.name = name;
			this.classroom = classroom;
			this.score = score;
		}
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", classroom=" + classroom + ", score=" + score + "]";
		}
		
		
	}
}
