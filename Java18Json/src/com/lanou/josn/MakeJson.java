package com.lanou.josn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class MakeJson {
	/*
 	ǰ�˷�������,��Ҫ��̨��������,��json����ѡ�����ݴ����ʽ
 	��������ν�����������ת����json��ʽ���ַ�����?
 	javabean list map�ַ���	
	 */
	//��java�е��ַ�������ת����json
	public static void makeJsonByString() {
		String string = "�����ǵػ�, С����Ģ��.";
		String jsonString = JSON.toJSONString(string);
		System.out.println(string);
		System.out.println(jsonString);
	}
	
	//��java�е�javbeanת����json
	public static void makeJsonByBean() {
		Student student = new Student("����", "��", "����");
		String jsonString = JSON.toJSONString(student);
		System.out.println(jsonString);
	}
	//��java�е�listת����json
	public static void makeJsonByList() {
		/*List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("С��");
		list.add("����");*/
		
		/*List<Student> list = new ArrayList<Student>();
		list.add(new Student("����", "��", "����"));
		list.add(new Student("����1", "��", "����1"));
		list.add(new Student("����2", "��", "����2"));*/
		
		List<Map<String, Student>> list = new ArrayList<Map<String, Student>>();
		Map<String, Student> map1 = new HashMap<String, Student>(); 
		map1.put("stu1", new Student("����", "��", "����"));
		map1.put("stu2", new Student("����1", "��", "����1"));
		map1.put("stu3", new Student("����2", "��", "����2"));
		list.add(map1);
		
		String jsonString = JSON.toJSONString(list);
		System.out.println(jsonString);
	}
	
	//��java�е�map����ת����json����
	public static void makeJsonByMap() {
		Map<String, Student> map1 = new HashMap<String, Student>(); 
		map1.put("stu1", new Student("����", "��", "����"));
		map1.put("stu2", new Student("����1", "��", "����1"));
		map1.put("stu3", new Student("����2", "��", "����2"));
		String jsonString = JSON.toJSONString(map1);
		System.out.println(jsonString);
	}
	public static void main(String[] args) {
		makeJsonByString();
		makeJsonByBean();
		makeJsonByList();
		makeJsonByMap();
	}
}
