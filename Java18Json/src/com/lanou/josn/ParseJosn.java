package com.lanou.josn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;

public class ParseJosn {
	/*
	 	fastjson�ǰ���Ͱ��ṩ��һ�����ڴ���json���ݸ�ʽ�Ŀ�Դ���,�ٶȿ�,������
	 */
	/*
	 	josn�����������ݸ�ʽ
	 		���������Ĳ�νṹʹ�� JSON ��Ϊ��������ݽ������ԡ� �������Ķ��ͱ�д��ͬʱҲ���ڻ������������ɣ�����Ч���������紫��Ч�ʡ�
	 */
	/*
	 	json���ص�:
	 	�����ʾΪ��ֵ��
		�����ɶ��ŷָ�
		�����ű������ Map
		�����ű������� List

	 */
	//�������������ʱ,��������
	public static void parseArr() {
		//fastjson����json����ʱ�ĺ�����ΪJSONReader JSON
		try {
			JSONReader reader = new JSONReader(new FileReader("stu.json"));
			//��json����ת�����ַ���
			String string = reader.readString();
			System.out.println(string);
			//�۲�json�ַ��������Ľṹ,�����[]�͵�������������,�����{}�͵�������������
			/*
			 	��һ������:������json�ַ���
			 	�ڶ�������:Ҫ����Ķ�����������
			 	�����Ҫ����Զ���ֵ,����ڲ���������:
			 		1.���Ե�setter  getter
			 		2.������Ҫ��json�ĵ��ж����keyֵһ��
			 */
			/*List<Student> list = JSON.parseArray(string, Student.class);
			System.out.println(list);*/
			/*JSONArray arr = JSON.parseArray(string);
			ArrayList<Student> list = new ArrayList<Student>();
			for (Object object : list) {
				JSONObject obj = (JSONObject)object;
				Student student = new Student((String)obj.get("name"), (String)obj.get("gender"), 
						(String)obj.get("wife"));
				list.add(student);
			}
			System.out.println(list);*/
			/*for (Object object : arr) {
				//��objectת����JSONBObject����
				JSONObject obj = (JSONObject)object;
				Object name = obj.get("name");
				Object gender = obj.get("gender");
				Object wife = obj.get("wife");
				System.out.println(name + "-" + gender + "-" + wife);
				Student student = new Student((String)name, (String)gender, (String)wife);
				System.out.println(student);
			}*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 	��json������ǰ����
	 		1.�����ĵ�
	 		2.����json�ַ���
	 		��װ����
	 */
	public static String getJStr(String filePath) {
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
	//json�ĵ������Ϊ������
	public static void parseObject() {
		String jStr = getJStr("teacher.json");
		Teacher teacher = JSON.parseObject(jStr, Teacher.class);
		System.out.println(teacher);
		
		/*JSONObject object = JSON.parseObject(jStr);
		System.out.println(object.get("name") + "-" + object.get("gender") + "-" + object.get("age") +
				"-" + object.get("hobby"));
		Teacher teacher = new Teacher((String)object.get("name"), (String)object.get("gender"), 
				(String)object.get("age"), (String)object.get("hobby"));
		System.out.println(teacher);*/
	}
	
	public static void pasePhone() {
		String jStr1 = getJStr("phone.json");
		JSONObject object = JSON.parseObject(jStr1);
		Object obj = object.get("data");
		String string = obj.toString();
		List<Phone> list = JSON.parseArray(string, Phone.class);
		for (Phone phone : list) {
			System.out.println(phone);
		}
	}
	public static void main(String[] args) {
		parseArr();
		parseObject();
		pasePhone();
	}
}
