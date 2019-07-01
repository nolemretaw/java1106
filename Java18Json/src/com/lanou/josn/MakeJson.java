package com.lanou.josn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class MakeJson {
	/*
 	前端发送请求,需要后台传递数据,而json是首选的数据传输格式
 	那我们如何将常见的数据转换成json格式的字符串呢?
 	javabean list map字符串	
	 */
	//将java中的字符串对象转换成json
	public static void makeJsonByString() {
		String string = "天王盖地虎, 小鸡炖蘑菇.";
		String jsonString = JSON.toJSONString(string);
		System.out.println(string);
		System.out.println(jsonString);
	}
	
	//将java中的javbean转换成json
	public static void makeJsonByBean() {
		Student student = new Student("晨晨", "男", "郭新");
		String jsonString = JSON.toJSONString(student);
		System.out.println(jsonString);
	}
	//将java中的list转换成json
	public static void makeJsonByList() {
		/*List<String> list = new ArrayList<String>();
		list.add("晨晨");
		list.add("小黄");
		list.add("阿黄");*/
		
		/*List<Student> list = new ArrayList<Student>();
		list.add(new Student("晨晨", "男", "郭新"));
		list.add(new Student("晨晨1", "男", "郭新1"));
		list.add(new Student("晨晨2", "男", "郭新2"));*/
		
		List<Map<String, Student>> list = new ArrayList<Map<String, Student>>();
		Map<String, Student> map1 = new HashMap<String, Student>(); 
		map1.put("stu1", new Student("晨晨", "男", "郭新"));
		map1.put("stu2", new Student("晨晨1", "男", "郭新1"));
		map1.put("stu3", new Student("晨晨2", "男", "郭新2"));
		list.add(map1);
		
		String jsonString = JSON.toJSONString(list);
		System.out.println(jsonString);
	}
	
	//将java中的map集合转换成json集合
	public static void makeJsonByMap() {
		Map<String, Student> map1 = new HashMap<String, Student>(); 
		map1.put("stu1", new Student("晨晨", "男", "郭新"));
		map1.put("stu2", new Student("晨晨1", "男", "郭新1"));
		map1.put("stu3", new Student("晨晨2", "男", "郭新2"));
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
