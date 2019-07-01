package com.lanou.teacher;

import java.util.ArrayList;

//��ϵ�˹�����
public class ContactManager {
	//����һ��list�������������е���ϵ��
	private ArrayList<Contact> list;
	
	//�������Ϊnull,����ն����ǲ�������÷���
	//����ϵ�˹�����Ĺ��췽���У���list���г�ʼ��
	public ContactManager() {
		list = new ArrayList<Contact>();
	}
	
	//1�������ϵ��
	public void addContact(Contact contact) {
		if (contact.getName() == null ||
				contact.getName().equals("") ||
				contact.getGender() == null ||
				contact.getGroup() == null ||
				contact.getPhone() == null ||
				contact.getAge() == 0) {
			System.out.println("��Ϣ����Ϊ�գ������ϵ��ʧ�ܣ�");
		} else {
			System.out.println("�����ϵ�˳ɹ���");
			list.add(contact);
		}
	}
	
	//2�����ݵ绰������ϵ��
	public Contact findContactByPhone(String phone) {
		//��������
		for (Contact contact : list) {
			if (contact.getPhone().equals(phone)) {
				return contact;
			}
		}
		System.out.println("û��ƥ�����ϵ��");
		return null;
	}
	
	//3�����ݷ��������ϵ��
	public ArrayList<Contact> findContactsByGroup(String group) {
		//��������������������ϵ����
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		for (Contact contact : list) {
			if (contact.getGroup().equals(group)) {
				contacts.add(contact);
			}
		}
		if (contacts.size() == 0) {
			System.out.println("û��������������ϵ��!");
		}
		return contacts;
	}
	
	//4�������Ա������ϵ��
	public ArrayList<Contact> findContactsByGender(String gender) {
		//��������������������ϵ����
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		for (Contact contact : list) {
			if (contact.getGender().equals(gender)) {
				contacts.add(contact);
			}
		}
		if (contacts.size() == 0) {
			System.out.println("û��������������ϵ��!");
		}
		return contacts;
	}
	
	//5����������ɾ����ϵ�� (�������ظ�)
	public void deleteContactByName(String name) {
		//1��ɾ����֮��ֱ��return
		/*for (Contact contact : list) {
			if (contact.getName().equals(name)) {
				list.remove(contact);
				return;
			}
		}*/
		//2����¼Ҫɾ�����ˣ�����֮����ȥɾ��
		/*Contact c = null;
		for (Contact contact : list) {
			if (contact.getName().equals(name)) {
				c = contact;
			}
		}
		if (c == null) {
			System.out.println("û��Ҫɾ������ϵ��");
		} else {
			list.remove(c);
		}*/
		//3��
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				list.remove(i);
				i--;
			}
		}
	}
	
	//6�����ݷ���ɾ����ϵ��
	public void deleteContactsByGroup(String group) {
		//�ȵõ�����������ϵ��
		ArrayList<Contact> groups = findContactsByGroup(group);
		if (groups.size() == 0) {
			System.out.println("û��ƥ�����ϵ��");
		} else {
			list.removeAll(groups);
		}
	}
	
	//7�����ݷ��������ϵ�ˣ����Ұ������併������
	public ArrayList<Contact> findContactsAndSort(String group) {
		//�ȵõ�����������ϵ��
		ArrayList<Contact> groups = findContactsByGroup(group);
		if (groups.size() == 0) {
			System.out.println("û��ƥ�����ϵ��");
		} else {
			//����
			for (int i = 0; i < groups.size() - 1; i++) {
				for (int j = 0; j < groups.size() - 1 - i; j++) {
					if (groups.get(j).getAge() < groups.get(j + 1).getAge()) {
						Contact temp = groups.get(j);
						groups.set(j, groups.get(j + 1));
						groups.set(j + 1, temp);
					}
				}
			}
		}
		return groups;
	}
	
	//8��չʾ������ϵ��
	public void showAllContacts() {
		for (Contact contact : list) {
			System.out.println(contact);
		}
	}
	
	
	
	
	
	
}
