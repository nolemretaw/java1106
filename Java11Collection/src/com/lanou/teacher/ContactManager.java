package com.lanou.teacher;

import java.util.ArrayList;

//联系人管理类
public class ContactManager {
	//声明一个list集合来保存所有的联系人
	private ArrayList<Contact> list;
	
	//如果对象为null,代表空对象，是不允许调用方法
	//在联系人管理类的构造方法中，对list进行初始化
	public ContactManager() {
		list = new ArrayList<Contact>();
	}
	
	//1、添加联系人
	public void addContact(Contact contact) {
		if (contact.getName() == null ||
				contact.getName().equals("") ||
				contact.getGender() == null ||
				contact.getGroup() == null ||
				contact.getPhone() == null ||
				contact.getAge() == 0) {
			System.out.println("信息不能为空，添加联系人失败！");
		} else {
			System.out.println("添加联系人成功！");
			list.add(contact);
		}
	}
	
	//2、根据电话查找联系人
	public Contact findContactByPhone(String phone) {
		//遍历方法
		for (Contact contact : list) {
			if (contact.getPhone().equals(phone)) {
				return contact;
			}
		}
		System.out.println("没有匹配的联系人");
		return null;
	}
	
	//3、根据分组查找联系人
	public ArrayList<Contact> findContactsByGroup(String group) {
		//创建保存满足条件的联系人组
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		for (Contact contact : list) {
			if (contact.getGroup().equals(group)) {
				contacts.add(contact);
			}
		}
		if (contacts.size() == 0) {
			System.out.println("没有满足条件的联系人!");
		}
		return contacts;
	}
	
	//4、根据性别查找联系人
	public ArrayList<Contact> findContactsByGender(String gender) {
		//创建保存满足条件的联系人组
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		for (Contact contact : list) {
			if (contact.getGender().equals(gender)) {
				contacts.add(contact);
			}
		}
		if (contacts.size() == 0) {
			System.out.println("没有满足条件的联系人!");
		}
		return contacts;
	}
	
	//5、根据姓名删除联系人 (姓名不重复)
	public void deleteContactByName(String name) {
		//1、删除完之后直接return
		/*for (Contact contact : list) {
			if (contact.getName().equals(name)) {
				list.remove(contact);
				return;
			}
		}*/
		//2、记录要删除的人，遍历之后再去删除
		/*Contact c = null;
		for (Contact contact : list) {
			if (contact.getName().equals(name)) {
				c = contact;
			}
		}
		if (c == null) {
			System.out.println("没有要删除的联系人");
		} else {
			list.remove(c);
		}*/
		//3、
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				list.remove(i);
				i--;
			}
		}
	}
	
	//6、根据分组删除联系人
	public void deleteContactsByGroup(String group) {
		//先得到满足分组的联系人
		ArrayList<Contact> groups = findContactsByGroup(group);
		if (groups.size() == 0) {
			System.out.println("没有匹配的联系人");
		} else {
			list.removeAll(groups);
		}
	}
	
	//7、根据分组查找联系人，并且按照年龄降序排列
	public ArrayList<Contact> findContactsAndSort(String group) {
		//先得到满足分组的联系人
		ArrayList<Contact> groups = findContactsByGroup(group);
		if (groups.size() == 0) {
			System.out.println("没有匹配的联系人");
		} else {
			//排序
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
	
	//8、展示所有联系人
	public void showAllContacts() {
		for (Contact contact : list) {
			System.out.println(contact);
		}
	}
	
	
	
	
	
	
}
