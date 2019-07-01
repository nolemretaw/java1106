package com.lanou.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;

public class ParseJson2 {
	public static String getJstr(String filepath) {
		String jStr = null;
		try {
			JSONReader reader = new JSONReader(new FileReader(filepath));
			jStr = reader.readString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jStr;
	}
	
	public static void parsePhone(){
		String jStr = getJstr("phone.json");
		JSONObject object = JSON.parseObject(jStr);
		Object obj = object.get("data");
		String string = obj.toString();
		List<Phone> list = JSON.parseArray(string,Phone.class);
		for (Phone phone : list) {
			System.out.println(phone);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parsePhone();
	}

}
