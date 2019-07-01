package com.lanou.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.List;

import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;

public class ParseJson {
	//fastjson是阿里巴巴提供了一个用于处理json数据格式的开源类库,速度快,代码简洁
	/* json 轻量级的数据格式:
	 * 简洁和清晰的层次结构使得 JSON 成为理想的数据交换语言。 易于人阅读和编写，
	 * 同时也易于机器解析和生成，并有效地提升网络传输效率。
	 * json的特点
	  	对象表示为键值对
		数据由逗号分隔
		花括号保存对象
		方括号保存数组
 
	 */
	//最外层是[]
	public static void parseArr() {
		//fastjson解析json数据时的核心类为JSONReader JSON
		try {
			/*1. 先将json文档转为字符串
			 *2.  
			 */
			JSONReader reader = new JSONReader(new FileReader("stu.json"));
			//将json数据转成字符串
			String string = reader.readString();
			System.out.println(string);
			//观察json字符串最外层的结构,如果是[]就当作是数组来解析
			//如果是{}就当做是对象来解析
			/*	第一个参数: 解析的json字符串
			 * 	第二个参数: 要保存的对象的类的类型
			 *  如果想要完成自动赋值,类的内部必须满足:
			 * 	1. 属性的setter getter
			 *  2. 属性名要与json文档中对象的key值一致
			 */
			List<Student> list = JSON.parseArray(string, Student.class);
			System.out.println(list);
//			JSONArray arr = JSON.parseArray(string);
//			ArrayList<Student> list = new ArrayList<Student>();
//			for (Object object : arr) {
//				JSONObject obj = (JSONObject)object;
//				Student student = new Student((String)obj.get("name"),
//						(String)obj.get("gender"), (String)obj.get("wife"));
//				list.add(student);
//				
//			}
//			System.out.println(list);
//			for (Object object : arr) {
//				//将object转成JSONObject对象
//				JSONObject obj = (JSONObject) object;
//				Object name = obj.get("name");
//				Object gender = obj.get("gender");
//				Object wife = obj.get("wife");
//				System.out.println(name + "-" + gender + "-" + wife );
//				Student student = new Student((String)name, (String)gender, (String)wife);
//				System.out.println(student);
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*  将json解析的前两步
		 * 1. 加载文档
		 * 2. 生成json字符串
	 * 封装成方法
	 * 
	 */
	public static String getJstr(String filePath) {
		String jStr = null;
		try {
			JSONReader reader = new JSONReader(new FileReader(filePath));
			jStr = reader.readString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jStr;
	}
	//json文档最外层为{}	
	public static void parseObject() {
		String jstr = getJstr("teacher.json");
		Teacher teacher = JSON.parseObject(jstr, Teacher.class);
//		JSONObject object = JSON.parseObject(jstr);
//		System.out.println(object.get("name") + "-" +
//				object.get("gender") + "-" +
//				object.get("age") + "-" +
//				object.get("hobby"));
//		Teacher teacher = new Teacher((String)object.get("name"),
//					(String)object.get("gender"),
//					(String)object.get("age"),
//					(String)object.get("hobby"));
		System.out.println(teacher);
	}
	
	public static void main(String[] args) {
//		parseArr();
		parseObject();
	}

}
