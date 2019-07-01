package com.lanou.teacher;

import java.util.ArrayList;

public class Initial {
	public static void main(String[] args) {
		ContactManager c = new ContactManager();
		c.addContact(new Contact("晨晨", "男", "H5", "110", 18));
		c.addContact(new Contact("小花", "女", "H5", "120", 38));
		c.addContact(new Contact("郭新", "男", "Java", "119", 22));
		c.addContact(new Contact("廉振", "男", "Java", "114", 20));
		c.addContact(new Contact("赵彤", "男", "Java", "118", 26));
		c.showAllContacts();
		
		System.out.println("-----华丽的分割线-----");
		Contact contact = c.findContactByPhone("18");
		System.out.println(contact);
	
		System.out.println("-----华丽的分割线-----");
		ArrayList<Contact> list = c.findContactsByGroup("Unity");
		System.out.println(list);
		
		System.out.println("-----华丽的分割线-----");
		c.deleteContactByName("小花");
		c.showAllContacts();
		
		System.out.println("-----华丽的分割线-----");
		ArrayList<Contact> groups = c.findContactsAndSort("Java");
		System.out.println(groups);
		
		
	}
}
