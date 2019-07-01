package com.lanou.practice;
/*
�����ϵ�ˣ�������ϵ����Ϣ�ķǿ��ж�
���ݵ绰������ϵ��
���ݷ��������ϵ��
�����Ա������ϵ��
��������ɾ����ϵ��(�������ظ�)
���ݷ���ɾ����ϵ��
���ݷ��������ϵ�ˣ����������併������
չʾ������ϵ��
*/

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

public class ContactsManage {
	private ArrayList<Contacts>list;
	
	public ContactsManage() {
		list = new ArrayList<Contacts>();
	}
	//���
	public void addContact(Contacts contacts){
		if (contacts.getName() == null || contacts.getGender() == null || contacts.getPhone() == null ||
				contacts.getGroup() == null || contacts.getAge() == 0) {
			System.out.println("��Ϣ������,�벹��");
		} else {
			list.add(contacts);
		}
	}
	
	//�������
	public Contacts findContactByPhone(String phone) {
		//����
		for (Contacts contacts : list) {
			if (contacts.getPhone().equals(phone)) {
				return contacts;
			}
		}
		System.out.println("�޴���");
		return null;
	}
	
	//С��
	public ArrayList<Contacts> findContactByGroup(String group) {
		ArrayList<Contacts> contacts = new ArrayList<Contacts>();
		for (Contacts contacts1 : list) {
			if (contacts1.getGroup().equals(group)) {
				contacts.add(contacts1);
			}
		}
		if (contacts.size() == 0) {
			System.out.println("û��������ϵ��");
		}
		return null;	
	}
	
	//�Ա�
	public ArrayList<Contacts> findContactByGender(String gender) {
		ArrayList<Contacts> contacts = new ArrayList<Contacts>();
		for (Contacts contacts1 : list) {
			if (contacts1.getGender().equals(gender)) {
				contacts.add(contacts1);
			}
		}
		if (contacts.size() == 0) {
			System.out.println("û��������ϵ��");
		}
		return null;	
	}
	
	//չʾ
	public void showAllContacts() {
		for (Contacts contacts : list) {
			System.out.println(contacts);
		}
	}
}
