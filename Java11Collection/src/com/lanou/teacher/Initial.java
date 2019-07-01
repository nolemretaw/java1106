package com.lanou.teacher;

import java.util.ArrayList;

public class Initial {
	public static void main(String[] args) {
		ContactManager c = new ContactManager();
		c.addContact(new Contact("����", "��", "H5", "110", 18));
		c.addContact(new Contact("С��", "Ů", "H5", "120", 38));
		c.addContact(new Contact("����", "��", "Java", "119", 22));
		c.addContact(new Contact("����", "��", "Java", "114", 20));
		c.addContact(new Contact("��ͮ", "��", "Java", "118", 26));
		c.showAllContacts();
		
		System.out.println("-----�����ķָ���-----");
		Contact contact = c.findContactByPhone("18");
		System.out.println(contact);
	
		System.out.println("-----�����ķָ���-----");
		ArrayList<Contact> list = c.findContactsByGroup("Unity");
		System.out.println(list);
		
		System.out.println("-----�����ķָ���-----");
		c.deleteContactByName("С��");
		c.showAllContacts();
		
		System.out.println("-----�����ķָ���-----");
		ArrayList<Contact> groups = c.findContactsAndSort("Java");
		System.out.println(groups);
		
		
	}
}
