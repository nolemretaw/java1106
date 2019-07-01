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

/*��ȡѧ����Ϣ�����뼯��
 * */
public class ѧ����¼ {

	public static void main(String[] args) throws Exception{
		// 1��������������ȡ����
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("src/students.txt")));
		//2��ѭ����ȡÿһ������
		//��ÿһ�����ݽ�����һ��student����
		//�����е�student�������list����
		List<Student> students = new ArrayList<>();
		String line;
		while((line=br.readLine())!=null){
			if (line.equals("")) {
				Student student = parseLIneToStudent(line);
				students.add(student);
			}	
			br.close();
		}
		//����map����
		//key:classRoom�༶��
		//value��classRoom��ͬ��ѧ��list����
		Map<String,List<Student>> map = new HashMap<>();
		for (Student stu : students) {
			//ȡ��ÿ��ѧ����classRoom
			String classRoom = stu.getClassroom();
			//��classRoom����keyȥ��ȡvalueֵ
			List<Student> list = map.get(classRoom);
			if (list==null) {//��һ�γ��ָð༶��ѧ��
				list = new ArrayList<>();
			}
			list.add(stu);
			map.put(classRoom, list);
		}
		//����map����
		Set<Entry<String, List<Student>>> set = map.entrySet();
		for (Entry<String, List<Student>> entry : set) {
			System.out.println(entry.getKey()+entry.getValue());
		}
	}
	
	/**�����ݽ�����һ��student����
	 * */
	private static Student parseLIneToStudent(String line) {
		String[] array = line.split("/");
		return new Student(array[0],array[1],array[2],Integer.parseInt(array[3]));
	}
	static class Student implements Serializable{//���л������������л�Ϊ�ֽ�
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
