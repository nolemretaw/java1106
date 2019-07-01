package com.lanou.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.List;

import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;

public class ParseJson {
	//fastjson�ǰ���Ͱ��ṩ��һ�����ڴ���json���ݸ�ʽ�Ŀ�Դ���,�ٶȿ�,������
	/* json �����������ݸ�ʽ:
	 * ���������Ĳ�νṹʹ�� JSON ��Ϊ��������ݽ������ԡ� �������Ķ��ͱ�д��
	 * ͬʱҲ���ڻ������������ɣ�����Ч���������紫��Ч�ʡ�
	 * json���ص�
	  	�����ʾΪ��ֵ��
		�����ɶ��ŷָ�
		�����ű������
		�����ű�������
 
	 */
	//�������[]
	public static void parseArr() {
		//fastjson����json����ʱ�ĺ�����ΪJSONReader JSON
		try {
			/*1. �Ƚ�json�ĵ�תΪ�ַ���
			 *2.  
			 */
			JSONReader reader = new JSONReader(new FileReader("stu.json"));
			//��json����ת���ַ���
			String string = reader.readString();
			System.out.println(string);
			//�۲�json�ַ��������Ľṹ,�����[]�͵���������������
			//�����{}�͵����Ƕ���������
			/*	��һ������: ������json�ַ���
			 * 	�ڶ�������: Ҫ����Ķ�����������
			 *  �����Ҫ����Զ���ֵ,����ڲ���������:
			 * 	1. ���Ե�setter getter
			 *  2. ������Ҫ��json�ĵ��ж����keyֵһ��
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
//				//��objectת��JSONObject����
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
	
	/*  ��json������ǰ����
		 * 1. �����ĵ�
		 * 2. ����json�ַ���
	 * ��װ�ɷ���
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
	//json�ĵ������Ϊ{}	
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
