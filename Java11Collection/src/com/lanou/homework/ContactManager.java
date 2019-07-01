package com.lanou.homework;

import java.util.ArrayList;

public class ContactManager {

	private ArrayList<Contact> list;
	//声明一个对象来保存所有联系人
	public ContactManager(){//在构造方法中对list进行初始化
		list = new ArrayList<Contact>();
	}
	
	public void addContact(Contact contact) {
		if (contact.getName() == null || 
			contact.getGender() == null ||
			contact.getGroup() == null ||
			contact.getPhone() == null ||
			contact.getGroup() == null ||
			contact.getAge() == 0){
			System.out.println("信息不完善,添加失败");
		} else{
			list.add(contact);
		}	
	}
	
	public Contact findContactByPhone(String phone) {
		for(Contact contact : list){
			if (contact.getPhone().equals(phone)) {
				return contact;
			}
		}
		System.out.println("没有此电话");
		return null;
	}
	
	public ArrayList<Contact> findContactByGroup(String group) {
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		for(Contact contact : list){
			if (contact.getGroup().equals(group)) {
				 contacts.add(contact);
			}
		}
		if (contacts.size() == 0 ) {
			System.out.println("没有满足该条件的联系人");
		}
		return contacts;
	}
	public Contact findContactByGender(String gender, String name){
		for(Contact contact : list){
			if (contact.getGender().equals(gender)) {
				if (contact.getName().equals(name)) {
					return contact;
				}
				System.out.println("没有此人");
				return null;
			}
		}
		return null;
	}
//1. for	
//	public void removeContactByName(String name){
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).equals(name)) {
//				list.remove(i--);//ArrayList删去一个或增加一个其他下标会相应改变
//			}
//		}
//	}
//2.foreach(1)
//	public void removeContactByName(String name){
//		for(Contact contact : list) {
//			if (contact.getName().equals(name)) {
//				list.remove(contact);
//				return;//删除后直接返回
//			}
//		}
//	}
//3.foreach(2)
	public void removeContactByName(String name){
		Contact c = null;
		for(Contact contact : list){
			if (contact.getName().equals(name)) {
				c = contact; 
			}
		}
		if (c == null ) {
			System.out.println("无此人");
		}else {
			list.remove(c);
		}
	}
	public void removeContactByGroup(String group) {
		ArrayList<Contact> contacts = findContactByGroup(group);
		if (contacts.size() == 0) {
			System.out.println("该组无人");
		} else {
			list.removeAll(contacts);
		}
	}
	public ArrayList<Contact>findContactsByGroup_and_Sort(String group){
		ArrayList<Contact>groups = findContactByGroup(group);
		if (groups.size() == 0) {
			System.out.println("没有此分组");
		}else {
			for (int i = 0; i < groups.size() - 1; i++) {
				for (int j = 0; j < groups.size() - i - 1; j++) {
					if (groups.get(j).getAge() < groups.get(j + 1).getAge() ) {
						Contact temp = groups.get(j);
						groups.set(j, groups.get(j+1));
						groups.set(j+1, temp);
					}
				}
			}
		}
		return groups;
	}
	public void showAllContacts(){
		for(Contact contact : list){
			System.out.println(contact);
		}
	}
}
