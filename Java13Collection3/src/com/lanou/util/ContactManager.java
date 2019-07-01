package com.lanou.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
	�����ϵ�ˣ�������绰����Ϊ�գ����ʧ�ܣ����Ǹ���治����~
��ȡĳ�������µ�������ϵ�ˣ����Ұ���������������
���ݵ绰����������ϵ��(˫�ر���)
��ȡ����Ů����ϵ�ˣ����Ұ������併������		
��������ɾ����ϵ�ˣ�����ͬ�������
ɾ��ĳ�������µ�������ϵ��
չʾ������ϵ��
*/

public class ContactManager {
	//����map�����ϵ����Ϣ<group,��>
	private TreeMap<String, ArrayList<Contact>> map;
	
	public ContactManager(){//��ʼ��
		map = new TreeMap<String,ArrayList<Contact>>();
	}
//1. ���
	public void addContact(Contact c){
		if (c.getName().equals("")||c.getPhone().equals("")) {
			System.out.println("��Ϣ����ȫ,���ʧ��");
		}else {
			ArrayList<Contact>list = map.get(c.getGroup());//��ø�value--��Ϣ��
			if (list == null) {//���鲻����
				list = new ArrayList<Contact>();//��ʼ������
				list.add(c);//������ӵ�����
				map.put(c.getGroup(), list);//���ü�ֵ����map
				
			}else {
				list.add(c);//���������ֱ�ӷ���	
			}
			System.out.println("��ӳɹ�");	
		}	
	}
//2. ��ȡĳ�������µ�������ϵ�ˣ����Ұ���������������
	public ArrayList<Contact> getContacts_and_Sort_by_Group(String group) {
		ArrayList<Contact> list = map.get(group);
		if (list == null ) {
			System.out.println("�÷��鲻����");
		}else {
			NameComparator nC = new NameComparator();
			Collections.sort(list,nC);
		}
		return list;
	}
//3.���ݵ绰����������ϵ��(˫�ر���)	
	public Contact selectContact_by_Phone(String phone){
		Set<String> set = map.keySet();
		for (String key : set) {
			ArrayList<Contact> list = map.get(key);
			for (Contact contact : list) {
				if (contact.getPhone().equals(phone)) {
					return contact;
				}
			}
		}
		System.out.println("û�д���ϵ��");
		return null;
	}

//4. ��ȡ����Ů����ϵ�ˣ����Ұ������併������	
	public ArrayList<Contact> getAllwomen(String gender) {
		Set<String> set = map.keySet();
		ArrayList<Contact> sexlist = new ArrayList<Contact>();
		for (String key : set) {
			ArrayList<Contact> list = map.get(key);
			for (Contact contact : list) {
				if (contact.getGender().equals(gender)) {
					sexlist.add(contact);
				}
			}
		}
		if (sexlist.size() == 0) {
			System.out.println("û���Ա�Ϊ" + gender + "����ϵ��");
			return null;
		}else {
			AgeComparator cN =  new AgeComparator();
			Collections.sort(sexlist,cN);
			return sexlist;	
		}
		
	}

//5. ��������ɾ����ϵ�ˣ�����ͬ�������
	public void deleteContact(String name) {
		String fN = PinYinUtil.getFirstSpell(name).substring(0,1).toUpperCase();
		ArrayList<Contact> list = map.get(fN);//�õ�����ϵ�����ڷ�������list
		
		ArrayList<Contact> newlist = new ArrayList<Contact>();
		if (list == null) {//�����ڴ˷���
			System.out.println("�����ڴ���ϵ��");
		}else{//���ڴ˷���
			if (list.size() == 1) { //������ϵ�˸���Ϊ1
				if (list.get(0).getName().equals(name)) {
					map.remove(fN);
					System.out.println( fN + " ��ֻ�� " + name + " һ����ϵ��,�ѽ�����ɾ��" );
				}else {
				System.out.println("û�и���ϵ��");	
					}
			}else{	//������ϵ�˸���>1
				for (int i = 0; i < list.size();i++) {
					if (list.get(i).getName().equals(name)) {
						newlist.add(list.get(i));//��ͬ�����˷�������newlist
					}	
				}
				System.out.println("�� " + newlist.size() + " ������: " +name +
						"�ֱ�Ϊ: ");
				int j = 0;//ѡ��Ҫɾ������ϵ��
				for(Contact contact : newlist) {
					System.out.println("("+ ++j + ") "+ contact.toString());
				}
				System.out.println("(0) ȫ��ɾ��");
				System.out.println("����Ҫɾ����һ��: (������ϵ�����)");
				Scanner scanner = new Scanner(System.in);
				int del = scanner.nextInt();
				scanner.close();
				if (del == 0) {
					list.removeAll(newlist);
					System.out.println("��ȫ��ɾ��");
				}else {
					list.removeAll(newlist);
					newlist.remove(del - 1);
					list.addAll(newlist);
					System.out.println("ɾ���ɹ�");
				}
	
			}
			if (list.size() == 0) {
				map.remove(fN);
				}
		}
	}
//6.ɾ��ĳ�������µ�������ϵ��
	public void deletAll_in_Group (String group){
		if (map.get(group) == null) {
			System.out.println("�����ڷ��� "+ group);
		}else {
		map.remove(group);
		System.out.println("ɾ���ɹ����� " + group);
		}
	}
//7.չʾ������ϵ��
	public void showAll(){
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println("-------------------" + key +"-------------------");
			ArrayList<Contact> list = map.get(key);
			for(Contact contact : list) {
				System.out.println(contact);
			}
		}
	}
}
