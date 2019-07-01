package com.lanou.homework;

import java.util.ArrayList;

public class ContactManager {

	private ArrayList<Contact> list;
	//����һ������������������ϵ��
	public ContactManager(){//�ڹ��췽���ж�list���г�ʼ��
		list = new ArrayList<Contact>();
	}
	
	public void addContact(Contact contact) {
		if (contact.getName() == null || 
			contact.getGender() == null ||
			contact.getGroup() == null ||
			contact.getPhone() == null ||
			contact.getGroup() == null ||
			contact.getAge() == 0){
			System.out.println("��Ϣ������,���ʧ��");
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
		System.out.println("û�д˵绰");
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
			System.out.println("û���������������ϵ��");
		}
		return contacts;
	}
	public Contact findContactByGender(String gender, String name){
		for(Contact contact : list){
			if (contact.getGender().equals(gender)) {
				if (contact.getName().equals(name)) {
					return contact;
				}
				System.out.println("û�д���");
				return null;
			}
		}
		return null;
	}
//1. for	
//	public void removeContactByName(String name){
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).equals(name)) {
//				list.remove(i--);//ArrayListɾȥһ��������һ�������±����Ӧ�ı�
//			}
//		}
//	}
//2.foreach(1)
//	public void removeContactByName(String name){
//		for(Contact contact : list) {
//			if (contact.getName().equals(name)) {
//				list.remove(contact);
//				return;//ɾ����ֱ�ӷ���
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
			System.out.println("�޴���");
		}else {
			list.remove(c);
		}
	}
	public void removeContactByGroup(String group) {
		ArrayList<Contact> contacts = findContactByGroup(group);
		if (contacts.size() == 0) {
			System.out.println("��������");
		} else {
			list.removeAll(contacts);
		}
	}
	public ArrayList<Contact>findContactsByGroup_and_Sort(String group){
		ArrayList<Contact>groups = findContactByGroup(group);
		if (groups.size() == 0) {
			System.out.println("û�д˷���");
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
