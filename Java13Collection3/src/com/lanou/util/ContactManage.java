package com.lanou.util;

import java.awt.RenderingHints.Key;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class ContactManage {
	private TreeMap<String, ArrayList<Contact>> map;
	public ContactManage() {
		map = new TreeMap<String,ArrayList<Contact>>();
	}
	public void addContact(Contact contact) {	
		/*if (contact.getName().equals(null) || contact.getGender().equals(null) || contact.getPhoneNum().equals(null) || 
				contact.getAge() == 0) {
			System.out.println("���ʧ��,��ȷ������������Ϣ�Ƿ�����");
		} else {
			if (map.containsKey(contact.getGroup())) {	
				map.get(contact.getGroup()).add(contact);	
			} else {
				ArrayList<Contact> list = new ArrayList<Contact>();
				list.add(contact);
				map.put(contact.getGroup(), list);
			}	
		}*/
		if (contact.getName().equals("") || contact.getPhone().equals("")) {
			System.out.println("��Ϣ������,�޷������ϵ��");
		} else {
			ArrayList<Contact> list = map.get(contact.getGroup());
			if (map.containsKey(contact.getGroup()) == false) {     //�ж�map����û����ϵ������ĸ����
				list = new ArrayList<Contact>();					//���û��,��ʼ��list
				list.add(contact);									//list������ϵ��
				map.put(contact.getGroup(), list);					//���list��map��
			} else {
				int index = 0;
				for (Contact contact2 : list) {						//���������  ˵��֮ǰ�������ϵ��
					if (contact2.equals(contact)) {					//�����˷���,�ж���ϵ���Ƿ��ظ�
						System.out.println(contact2.getName() +"���������ӹ���");
					} else {
						index++;
					}
				}
				if (index == list.size()) {							//��ϵ��û���ظ�
					list.add(contact);								//�����ϵ�˵�list��
					//map.put(contact.getGroup(), list);			//�޸�map�е�valueֵ
				}	
			}
		}
	}
	public ArrayList<Contact> getContactByGroup_Sort(String group) {
		ArrayList<Contact> list = new ArrayList<Contact>();
		if (map.containsKey(group)) {
			list = map.get(group);
			NameComparator nameCompartor = new NameComparator();
			Collections.sort(list, nameCompartor);
		} else {
			System.out.println("û��" + group + "��");
			return null;
		}
		return list;
	}
	public Contact searchContactByPhoneNum(String phone) {
		Contact contact = new Contact();
			Set<String> key = map.keySet();
			for (String string : key) {
				for (Contact c : map.get(string) ) {
					if (c.getPhone().equals(phone)) {
						contact = c;
						return contact;
					}
				}
			}
			System.out.println("û�����ҵ���");
		return null;
		
	}
	public ArrayList<Contact> getContactByGender_SortByAge(String gender) {
		ArrayList<Contact> list = new ArrayList<Contact>();
		Set<String> key = map.keySet();
		for (String string : key) {
			for (Contact c : map.get(string)) {
				if (c.getGender().equals(gender)) {
					list.add(c);
				}
			}
		}
		if (list.size() != 0) {
			AgeComparator ageComparator = new AgeComparator();
			Collections.sort(list,ageComparator);
			return list;
		}
		System.out.println("��ȷ������������Ϣ");
		return null;
	}
	public void deleteContactByName(String name) {
		ArrayList<Contact> list = new ArrayList<Contact>();
		ArrayList<Contact> list1 = new ArrayList<Contact>();
		list1 = map.get(PinYinUtil.getFirstSpell(name).substring(0,1).toUpperCase());
		for (Contact contact : list1) {
			if (contact.getName().equals(name)) {
				list.add(contact);
			}
		}
		if (list.size() == 0) {
			System.out.println("û����Ҫɾ������ϵ��");
		}
		if (list.size() == list1.size()) {
			map.remove(PinYinUtil.getFirstSpell(name).substring(0,1).toUpperCase());
		} 
		if (list.size() < list1.size()) {
			
			list1.removeAll(list);
			map.put(PinYinUtil.getFirstSpell(name).substring(0,1).toUpperCase(), list1);
		}
		
			
	}
	public void deleteContactByGroup(String group) {
		Set<String> key = map.keySet();
		for (String string : key) {
			if (string.equals(group)) {
				map.remove(string);
				return;
			}
		}
		System.out.println("û��" + group + "��");
	}
	public void showAllContact() {
		Set<String> key = map.keySet();
		for (String string : key) {
			System.out.println("-----" + string + "----");
			for (Contact contact : map.get(string)) {
				System.out.println(contact);
			}
			
		}
	}
	
	@Override
	public String toString() {
		return "" + map ;
	}
	
	
}
