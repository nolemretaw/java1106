package com.lanou.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.alibaba.fastjson.JSON;

public class MakeJson {
	/* ǰ�˷�������,��Ҫ��̨��������,��jSon����ѡ�����ݴ��ݸ�ʽ,��ν����������ݸ�ʽת��Ϊjson��ʽ���ַ���:
	 * javabean list map �ַ���
	 * 
	 */
	//��java�е��ַ���תΪjson
	public static void makeJsonByString() {
		String string = "�����ǵػ�,���������. ";
		String jsonString = JSON.toJSONString(string);	
		System.out.println(string);
		System.out.println(jsonString);
	}
	//��java�е�javabeanת����json
	public static void makeJsonByBean() {
		Student student = new Student("����", "��", "����");
		String jsonString = JSON.toJSONString(student);
		System.out.println(jsonString);
	}
	//��java�е�listת��Ϊjson
	public static void makeJsonByList() {
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�Ǻ�");
		list.add("�ں�");
		String jsonString = JSON.toJSONString(list);
		System.out.println(jsonString);
		
		List<Student> list2 = new ArrayList<Student>();
		list2.add(new Student("����", "��", "����"));
		list2.add(new Student("����", "��", "����"));
		list2.add(new Student("����", "��", "����"));
		String jsonString2 = JSON.toJSONString(list2);
		System.out.println(jsonString2);
				
	}
	
	//��java�е�map����תΪ�ַ���
	public static void makeJsonByMap(){
		Map<String, Student> map1 = new HashMap<String, Student>();
		map1.put("stu1", new Student("����", "��", "����"));
		map1.put("stu2", new Student("����", "��", "����"));
		map1.put("stu3", new Student("С��", "��", "����"));
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
