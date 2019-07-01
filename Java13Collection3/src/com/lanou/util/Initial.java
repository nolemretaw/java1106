package com.lanou.util;

public class Initial {

	public static void main(String[] args) {
		ContactManager map = new ContactManager();
		map.addContact(new Contact("����","��",18,"123"));
		map.addContact(new Contact("����","Ů",21,"567"));
		map.addContact(new Contact("�˲�","��",23,"999"));
		map.addContact(new Contact("�˻�","Ů",29,"243"));
		map.addContact(new Contact("��","��",27,"784"));
		map.addContact(new Contact("����","Ů",20,"345"));
		map.addContact(new Contact("�Ʒ�","Ů",22,"444"));
		map.addContact(new Contact("�Ʒ�","Ů",25,"454"));
		System.out.println("--------------------------�����ķָ���--------------------------");
		System.out.println(map.getContacts_and_Sort_by_Group("A"));
		System.out.println("--------------------------�����ķָ���--------------------------");
		System.out.println(map.selectContact_by_Phone("243"));
		System.out.println("----------------------------------------------------");
		System.out.println(map.getAllwomen("Ů"));
		System.out.println("--------------------------�����ķָ���--------------------------");
		map.deleteContact("�Ʒ�");
//		map.deleteContact("����");
		System.out.println("--------------------------�����ķָ���--------------------------");
		map.deletAll_in_Group("A");
		System.out.println("--------------------------�����ķָ���--------------------------");
		map.showAll();
	}

}
