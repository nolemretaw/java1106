package com.lanou.teacherpractice;

import java.util.ArrayList;

public class Initial {
	public static void main(String[] args) {
		ContactManager contactManager = new ContactManager();
		contactManager.addContact(new Contact("晨晨", "男", "110", "18"));
		contactManager.addContact(new Contact("魑魅魍魉", "女", "120", "180"));
		contactManager.addContact(new Contact("沙漠骆驼", "男", "119", "1800"));
		contactManager.addContact(new Contact("郭新", "女", "114", "8"));
		contactManager.addContact(new Contact("悟空", "男", "115", "18000"));
		contactManager.addContact(new Contact("廉振", "男", "116", "20"));
		contactManager.addContact(new Contact("隔壁泰山", "女", "117", "16"));
		contactManager.addContact(new Contact("单田芳", "男", "135", "88"));
		
		contactManager.showAllContacts();
		System.out.println("-----华丽的分割线-----");
		
		contactManager.deleteContactsByName2("单田芳");
		contactManager.showAllContacts();
		
		/*ArrayList<Contact> list = contactManager.findContactsByGroup("C");
		for (Contact contact : list) {
			System.out.println(contact);
		}
		System.out.println("-----华丽的分割线-----");
		
		Contact contact = contactManager.findContactByPhone("140");
		System.out.println(contact);
		System.out.println("-----华丽的分割线-----");
		
		ArrayList<Contact> list1 = contactManager.findContactsByGender("女");
		for (Contact contact1 : list1) {
			System.out.println(contact1);
		}
		System.out.println("-----华丽的分割线-----");*/
		
		/*contactManager.deleteContactsByName("单田芳");
		contactManager.showAllContacts();
		System.out.println("-----华丽的分割线-----");
		
		contactManager.deleteContactsByName("隔壁泰山");
		contactManager.showAllContacts();
		System.out.println("-----华丽的分割线-----");
		
		contactManager.deleteContactsByGroup("M");
		contactManager.showAllContacts();*/
		
		
		
	}
}
