package com.lanou.teacherpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

public class ContactManager {
	//使用TreeMap来保存所有的联系人
	private TreeMap<String, ArrayList<Contact>> map;

	public TreeMap<String, ArrayList<Contact>> getMap() {
		return map;
	}
	public void setMap(TreeMap<String, ArrayList<Contact>> map) {
		this.map = map;
	}
	
	public ContactManager() {
		map = new TreeMap<String, ArrayList<Contact>>();
	}
	
	//添加联系人的方法，非空判断
	public void addContact(Contact c) {
		if (c.getName().equals("") || c.getPhone().equals("")) {
			System.out.println("联系人信息不能为空");
		} else {
			/*
			 	此人的组存在或者不存在
			 	存在：
			 		将此人直接添加到该组
			 	不存在：
			 		先创建此组，然后将人放入该组，并将该组加入到map
			 */
			ArrayList<Contact> list = map.get(c.getGroup());
			if (list == null) {
				list = new ArrayList<Contact>();
				list.add(c);
				map.put(c.getGroup(), list);
			} else {
				list.add(c);
			}
		}
	}
	
	//获取某个分组下的所有联系人，按照姓名升序排列
	public ArrayList<Contact> findContactsByGroup(String group) {
		ArrayList<Contact> list = map.get(group);
		if (list == null) {
			System.out.println("该组不存在");
		} else {
			NameComparator nameComparator = new NameComparator();
			Collections.sort(list, nameComparator);
		}
		return list;
	}
	
	//根据电话号码查找联系人
	public Contact findContactByPhone(String phone) {
		Set<String> set = map.keySet();
		for (String key : set) {
			ArrayList<Contact> list = map.get(key);
			for (Contact contact : list) {
				if (contact.getPhone().equals(phone)) {
					return contact;
				}
			}
		}
		System.out.println("没有找到联系人");
		return null;
	}
	
	//获取所有女性联系人，按照年龄降序排列
	public ArrayList<Contact> findContactsByGender(String gender) {
		ArrayList<Contact> list = new ArrayList<Contact>();
		Set<String> set = map.keySet();
		for (String key : set) {
			ArrayList<Contact> l = map.get(key);
			for (Contact contact : l) {
				if (contact.getGender().equals(gender)) {
					list.add(contact);
				}
			}
		}
		if (list.size() == 0) {
			System.out.println("没有找到联系人");
		} else {
			AgeComparator ageComparator = new AgeComparator();
			Collections.sort(list, ageComparator);
		}
		return list;
	}
	
	//根据姓名删除联系人
	public void deleteContactsByName(String name) {
		ArrayList<Contact> list = new ArrayList<Contact>();
		Set<String> set = map.keySet();
		for (String key : set) {
			ArrayList<Contact> l = map.get(key);
			for (Contact contact : l) {
				if (contact.getName().equals(name)) {
					list.add(contact);
				}
			}
		}
		if (list.size() == 0) {
			System.out.println("没有找到要删除的联系人");
		} else {
			/*
			 	1、如果删除的这一组中的人数与原有组的人数一致
			 	原有组直接删除
			 	2、如果删除的这一组中的人数小于原有组的人数
			 	让原有组将这组人删除
			 */
			String key = list.get(0).getGroup();
			ArrayList<Contact> oldList = map.get(key);
			if (oldList.size() == list.size()) {
				map.remove(key);
			} else {
				oldList.removeAll(list);
			}
		}
	}
	public void deleteContactsByName2(String name) {
		String s = PinYinUtil.getFirstSpell(name).substring(0, 1).toUpperCase();
		Set<String> set = map.keySet();
		for (String key : set) {
			ArrayList<Contact> list = map.get(key);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					list.remove(i);
					i--;
				}
			}
		}
		if (map.get(s).size() == 0) {
			map.remove(s);
		}
	}
	
	
	//根据姓名删除联系人2
	
	
	//删除某个分组下的所有联系人
	public void deleteContactsByGroup(String group) {
		ArrayList<Contact> list = map.get(group);
		if (list == null) {
			System.out.println("该组不存在");
		} else {
			map.remove(group);
		}
	}
	
	//展示所有联系人
	public void showAllContacts() {
		//遍历map
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println("-----" + key + "-----");
			ArrayList<Contact> list = map.get(key);
			for (Contact contact : list) {
				System.out.println(contact);
			}
		}
 	}
	
	
	
	
	
	
	
	
	
	
	
}
