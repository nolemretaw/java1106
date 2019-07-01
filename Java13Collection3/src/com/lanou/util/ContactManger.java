package com.lanou.util;
/*
添加联系人，姓名或电话号码为空，添加失败，考虑改组存不存在~
获取某个分组下的所有联系人，并且按照姓名升序排列
根据电话号码搜索联系人(双重遍历)
获取所有女性联系人，并且按照年龄降序排列		
根据姓名删除联系人，考虑同名的情况
删除某个分组下的所有联系人
展示所有联系人
*/

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class ContactManger {
	//添加
	private TreeMap<String, ArrayList<Contact>> map;
	public void addNum(Contact contact) {
		if (contact.getName() == null || contact.getPhone() == null) {
			System.out.println("信息不完整");
		}
		ArrayList<Contact> list = map.get(contact.getGroup());
		if (list == null) {
			list = new ArrayList<Contact>();
			list.add(contact);
			map.put(contact.getGroup(), list);
		} else {
			list.add(contact);
		}
		System.out.println("添加成功");
	}
	
	
	public Contact selectContactByPhone(String phone) {
		Set<String> set = map.keySet();
		for (String key : set) {
			ArrayList<Contact> list = map.get(key);
			for (Contact contact : list) {
				if (contact.getPhone().equals(phone)) {
					return contact;
				}
			}
		}
		System.out.println("没有找到此联系人");
		return null;
	}

	
	
}
