package com.lanou.util;

import java.util.ArrayList;
import java.util.TreeMap;

public class InitialManger {
	public static void main(String[] args) {
		ContactManage contactManage = new ContactManage();
		contactManage.addContact(new Contact("³¿³¿","220", "ÄÐ", 18));
		contactManage.addContact(new Contact("ºú³¿","204", "Å®", 39));
		contactManage.addContact(new Contact("Äã³¿","100", "Å®", 19));
		contactManage.addContact(new Contact("°¡³¿","122", "ÄÐ", 9));
		contactManage.showAllContact();
	}
}
