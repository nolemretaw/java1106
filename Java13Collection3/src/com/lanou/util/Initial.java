package com.lanou.util;

public class Initial {

	public static void main(String[] args) {
		ContactManager map = new ContactManager();
		map.addContact(new Contact("阿明","男",18,"123"));
		map.addContact(new Contact("阿冰","女",21,"567"));
		map.addContact(new Contact("菜菜","男",23,"999"));
		map.addContact(new Contact("菜华","女",29,"243"));
		map.addContact(new Contact("大宝","男",27,"784"));
		map.addContact(new Contact("大娃","女",20,"345"));
		map.addContact(new Contact("菲菲","女",22,"444"));
		map.addContact(new Contact("菲菲","女",25,"454"));
		System.out.println("--------------------------华丽的分割线--------------------------");
		System.out.println(map.getContacts_and_Sort_by_Group("A"));
		System.out.println("--------------------------华丽的分割线--------------------------");
		System.out.println(map.selectContact_by_Phone("243"));
		System.out.println("----------------------------------------------------");
		System.out.println(map.getAllwomen("女"));
		System.out.println("--------------------------华丽的分割线--------------------------");
		map.deleteContact("菲菲");
//		map.deleteContact("吴里");
		System.out.println("--------------------------华丽的分割线--------------------------");
		map.deletAll_in_Group("A");
		System.out.println("--------------------------华丽的分割线--------------------------");
		map.showAll();
	}

}
