package com.lanou.util;

import java.util.ArrayList;
import java.util.TreeMap;

public class InitialManger {
	public static void main(String[] args) {
		ContactManage contactManage = new ContactManage();
		contactManage.addContact(new Contact("����","220", "��", 18));
		contactManage.addContact(new Contact("����","204", "Ů", 39));
		contactManage.addContact(new Contact("�㳿","100", "Ů", 19));
		contactManage.addContact(new Contact("����","122", "��", 9));
		contactManage.showAllContact();
	}
}
