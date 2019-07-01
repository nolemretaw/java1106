package com.lanou.practice;

import java.util.ArrayList;
import java.util.List;

public class Initial {
	public static void main(String[] args) {
		Contacts contacts = new Contacts("习近平1", "男", "110", "主席", 40);
		Contacts contacts1 = new Contacts("习近平2", "男", "1100", "主席", 40);
		Contacts contacts2 = new Contacts("习近平3", "男", "11000", "大大", 40);
		Contacts contacts3 = new Contacts("习近平4", "男", "110000", "大大", 40);
		Contacts contacts4 = new Contacts("习近平5", "男", "1100000", "主席", 40);
		ContactsManage c = new ContactsManage(); 
	}
}
