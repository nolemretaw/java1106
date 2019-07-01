package com.lanou.practice;
/*
添加联系人，包含联系人信息的非空判断
根据电话查找联系人
根据分组查找联系人
根据性别查找联系人
根据姓名删除联系人(姓名不重复)
根据分组删除联系人
根据分组查找联系人，并按照年龄降序排列
展示所有联系人
*/

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

public class ContactsManage {
	private ArrayList<Contacts>list;
	
	public ContactsManage() {
		list = new ArrayList<Contacts>();
	}
	//添加
	public void addContact(Contacts contacts){
		if (contacts.getName() == null || contacts.getGender() == null || contacts.getPhone() == null ||
				contacts.getGroup() == null || contacts.getAge() == 0) {
			System.out.println("信息不完善,请补充");
		} else {
			list.add(contacts);
		}
	}
	
	//号码查人
	public Contacts findContactByPhone(String phone) {
		//遍历
		for (Contacts contacts : list) {
			if (contacts.getPhone().equals(phone)) {
				return contacts;
			}
		}
		System.out.println("无此人");
		return null;
	}
	
	//小组
	public ArrayList<Contacts> findContactByGroup(String group) {
		ArrayList<Contacts> contacts = new ArrayList<Contacts>();
		for (Contacts contacts1 : list) {
			if (contacts1.getGroup().equals(group)) {
				contacts.add(contacts1);
			}
		}
		if (contacts.size() == 0) {
			System.out.println("没有满足联系人");
		}
		return null;	
	}
	
	//性别
	public ArrayList<Contacts> findContactByGender(String gender) {
		ArrayList<Contacts> contacts = new ArrayList<Contacts>();
		for (Contacts contacts1 : list) {
			if (contacts1.getGender().equals(gender)) {
				contacts.add(contacts1);
			}
		}
		if (contacts.size() == 0) {
			System.out.println("没有满足联系人");
		}
		return null;	
	}
	
	//展示
	public void showAllContacts() {
		for (Contacts contacts : list) {
			System.out.println(contacts);
		}
	}
}
