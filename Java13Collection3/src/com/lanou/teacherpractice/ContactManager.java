package com.lanou.teacherpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

public class ContactManager {
	//ʹ��TreeMap���������е���ϵ��
	private TreeMap<String, ArrayList<Contact>> map;

	public TreeMap<String, ArrayList<Contact>> getMap() {
		return map;
	}
	public void setMap(TreeMap<String, ArrayList<Contact>> map) {
		this.map = map;
	}
	
	public ContactManager() {
		map = new TreeMap<String, ArrayList<Contact>>();
	}
	
	//�����ϵ�˵ķ������ǿ��ж�
	public void addContact(Contact c) {
		if (c.getName().equals("") || c.getPhone().equals("")) {
			System.out.println("��ϵ����Ϣ����Ϊ��");
		} else {
			/*
			 	���˵�����ڻ��߲�����
			 	���ڣ�
			 		������ֱ����ӵ�����
			 	�����ڣ�
			 		�ȴ������飬Ȼ���˷�����飬����������뵽map
			 */
			ArrayList<Contact> list = map.get(c.getGroup());
			if (list == null) {
				list = new ArrayList<Contact>();
				list.add(c);
				map.put(c.getGroup(), list);
			} else {
				list.add(c);
			}
		}
	}
	
	//��ȡĳ�������µ�������ϵ�ˣ�����������������
	public ArrayList<Contact> findContactsByGroup(String group) {
		ArrayList<Contact> list = map.get(group);
		if (list == null) {
			System.out.println("���鲻����");
		} else {
			NameComparator nameComparator = new NameComparator();
			Collections.sort(list, nameComparator);
		}
		return list;
	}
	
	//���ݵ绰���������ϵ��
	public Contact findContactByPhone(String phone) {
		Set<String> set = map.keySet();
		for (String key : set) {
			ArrayList<Contact> list = map.get(key);
			for (Contact contact : list) {
				if (contact.getPhone().equals(phone)) {
					return contact;
				}
			}
		}
		System.out.println("û���ҵ���ϵ��");
		return null;
	}
	
	//��ȡ����Ů����ϵ�ˣ��������併������
	public ArrayList<Contact> findContactsByGender(String gender) {
		ArrayList<Contact> list = new ArrayList<Contact>();
		Set<String> set = map.keySet();
		for (String key : set) {
			ArrayList<Contact> l = map.get(key);
			for (Contact contact : l) {
				if (contact.getGender().equals(gender)) {
					list.add(contact);
				}
			}
		}
		if (list.size() == 0) {
			System.out.println("û���ҵ���ϵ��");
		} else {
			AgeComparator ageComparator = new AgeComparator();
			Collections.sort(list, ageComparator);
		}
		return list;
	}
	
	//��������ɾ����ϵ��
	public void deleteContactsByName(String name) {
		ArrayList<Contact> list = new ArrayList<Contact>();
		Set<String> set = map.keySet();
		for (String key : set) {
			ArrayList<Contact> l = map.get(key);
			for (Contact contact : l) {
				if (contact.getName().equals(name)) {
					list.add(contact);
				}
			}
		}
		if (list.size() == 0) {
			System.out.println("û���ҵ�Ҫɾ������ϵ��");
		} else {
			/*
			 	1�����ɾ������һ���е�������ԭ���������һ��
			 	ԭ����ֱ��ɾ��
			 	2�����ɾ������һ���е�����С��ԭ���������
			 	��ԭ���齫������ɾ��
			 */
			String key = list.get(0).getGroup();
			ArrayList<Contact> oldList = map.get(key);
			if (oldList.size() == list.size()) {
				map.remove(key);
			} else {
				oldList.removeAll(list);
			}
		}
	}
	public void deleteContactsByName2(String name) {
		String s = PinYinUtil.getFirstSpell(name).substring(0, 1).toUpperCase();
		Set<String> set = map.keySet();
		for (String key : set) {
			ArrayList<Contact> list = map.get(key);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					list.remove(i);
					i--;
				}
			}
		}
		if (map.get(s).size() == 0) {
			map.remove(s);
		}
	}
	
	
	//��������ɾ����ϵ��2
	
	
	//ɾ��ĳ�������µ�������ϵ��
	public void deleteContactsByGroup(String group) {
		ArrayList<Contact> list = map.get(group);
		if (list == null) {
			System.out.println("���鲻����");
		} else {
			map.remove(group);
		}
	}
	
	//չʾ������ϵ��
	public void showAllContacts() {
		//����map
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println("-----" + key + "-----");
			ArrayList<Contact> list = map.get(key);
			for (Contact contact : list) {
				System.out.println(contact);
			}
		}
 	}
	
	
	
	
	
	
	
	
	
	
	
}
