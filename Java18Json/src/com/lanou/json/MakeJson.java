package com.lanou.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.alibaba.fastjson.JSON;

public class MakeJson {
	/* 前端发送请求,需要后台传递数据,而jSon是首选的数据传递格式,如何将常见的数据格式转换为json格式的字符串:
	 * javabean list map 字符串
	 * 
	 */
	//将java中的字符串转为json
	public static void makeJsonByString() {
		String string = "天王盖地虎,宝塔镇河妖. ";
		String jsonString = JSON.toJSONString(string);	
		System.out.println(string);
		System.out.println(jsonString);
	}
	//将java中的javabean转换成json
	public static void makeJsonByBean() {
		Student student = new Student("拉拉", "男", "哈哈");
		String jsonString = JSON.toJSONString(student);
		System.out.println(jsonString);
	}
	//将java中的list转换为json
	public static void makeJsonByList() {
		List<String> list = new ArrayList<String>();
		list.add("嘻嘻");
		list.add("呵呵");
		list.add("黑黑");
		String jsonString = JSON.toJSONString(list);
		System.out.println(jsonString);
		
		List<Student> list2 = new ArrayList<Student>();
		list2.add(new Student("拉拉", "男", "哈哈"));
		list2.add(new Student("拉拉", "男", "哈哈"));
		list2.add(new Student("拉拉", "男", "哈哈"));
		String jsonString2 = JSON.toJSONString(list2);
		System.out.println(jsonString2);
				
	}
	
	//将java中的map集合转为字符串
	public static void makeJsonByMap(){
		Map<String, Student> map1 = new HashMap<String, Student>();
		map1.put("stu1", new Student("晨晨", "男", "郭新"));
		map1.put("stu2", new Student("郭新", "男", "晨晨"));
		map1.put("stu3", new Student("小新", "男", "阿黄"));
		String jsonString = JSON.toJSONString(map1);
		System.out.println(jsonString);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeJsonByString();
		makeJsonByList();
		makeJsonByMap();
	}

}
