package com.lanou.util;
/*
�����ϵ�ˣ�������绰����Ϊ�գ����ʧ�ܣ����Ǹ���治����~
��ȡĳ�������µ�������ϵ�ˣ����Ұ���������������
���ݵ绰����������ϵ��(˫�ر���)
��ȡ����Ů����ϵ�ˣ����Ұ������併������		
��������ɾ����ϵ�ˣ�����ͬ�������
ɾ��ĳ�������µ�������ϵ��
չʾ������ϵ��
*/

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class ContactManger {
	//���
	private TreeMap<String, ArrayList<Contact>> map;
	public void addNum(Contact contact) {
		if (contact.getName() == null || contact.getPhone() == null) {
			System.out.println("��Ϣ������");
		}
		ArrayList<Contact> list = map.get(contact.getGroup());
		if (list == null) {
			list = new ArrayList<Contact>();
			list.add(contact);
			map.put(contact.getGroup(), list);
		} else {
			list.add(contact);
		}
		System.out.println("��ӳɹ�");
	}
	
	
	public Contact selectContactByPhone(String phone) {
		Set<String> set = map.keySet();
		for (String key : set) {
			ArrayList<Contact> list = map.get(key);
			for (Contact contact : list) {
				if (contact.getPhone().equals(phone)) {
					return contact;
				}
			}
		}
		System.out.println("û���ҵ�����ϵ��");
		return null;
	}

	
	
}
