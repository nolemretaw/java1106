package com.lanou.teacherpractice;

import java.util.ArrayList;

public class Initial {
	public static void main(String[] args) {
		ContactManager contactManager = new ContactManager();
		contactManager.addContact(new Contact("����", "��", "110", "18"));
		contactManager.addContact(new Contact("��������", "Ů", "120", "180"));
		contactManager.addContact(new Contact("ɳĮ����", "��", "119", "1800"));
		contactManager.addContact(new Contact("����", "Ů", "114", "8"));
		contactManager.addContact(new Contact("���", "��", "115", "18000"));
		contactManager.addContact(new Contact("����", "��", "116", "20"));
		contactManager.addContact(new Contact("����̩ɽ", "Ů", "117", "16"));
		contactManager.addContact(new Contact("���﷼", "��", "135", "88"));
		
		contactManager.showAllContacts();
		System.out.println("-----�����ķָ���-----");
		
		contactManager.deleteContactsByName2("���﷼");
		contactManager.showAllContacts();
		
		/*ArrayList<Contact> list = contactManager.findContactsByGroup("C");
		for (Contact contact : list) {
			System.out.println(contact);
		}
		System.out.println("-----�����ķָ���-----");
		
		Contact contact = contactManager.findContactByPhone("140");
		System.out.println(contact);
		System.out.println("-----�����ķָ���-----");
		
		ArrayList<Contact> list1 = contactManager.findContactsByGender("Ů");
		for (Contact contact1 : list1) {
			System.out.println(contact1);
		}
		System.out.println("-----�����ķָ���-----");*/
		
		/*contactManager.deleteContactsByName("���﷼");
		contactManager.showAllContacts();
		System.out.println("-----�����ķָ���-----");
		
		contactManager.deleteContactsByName("����̩ɽ");
		contactManager.showAllContacts();
		System.out.println("-----�����ķָ���-----");
		
		contactManager.deleteContactsByGroup("M");
		contactManager.showAllContacts();*/
		
		
		
	}
}
