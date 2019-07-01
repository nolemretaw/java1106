package com.lanou.homework;

import java.util.List;
import java.util.ArrayList;

public class Initial {

	public static void main(String[] args) {
		ContactManager list = new ContactManager();
		list.addContact(new Contact("htr","male","123","公司",23));
		list.addContact(new Contact("hir","male","546","公司",21));
		list.addContact(new Contact("har","famale","789","学校",29));
		list.addContact(new Contact("hrr","male","765","学校",24));
		list.addContact(new Contact("htf","famale","987","公司",25));
		Contact contact = list.findContactByGender("male", "htr");
		list.removeContactByName("hir");
		list.removeContactByGroup("公司");
		System.out.println(contact);
		System.out.println("---------------------------------------------------------");
		list.showAllContacts();
		System.out.println("---------------------------------------------------------");
		
		ArrayList<Contact> group = list.findContactsByGroup_and_Sort("学校");
		System.out.println(group);
	}

}
