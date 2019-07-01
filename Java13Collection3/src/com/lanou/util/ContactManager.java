package com.lanou.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
	添加联系人，姓名或电话号码为空，添加失败，考虑该组存不存在~
获取某个分组下的所有联系人，并且按照姓名升序排列
根据电话号码搜索联系人(双重遍历)
获取所有女性联系人，并且按照年龄降序排列		
根据姓名删除联系人，考虑同名的情况
删除某个分组下的所有联系人
展示所有联系人
*/

public class ContactManager {
	//创建map存放联系人信息<group,组>
	private TreeMap<String, ArrayList<Contact>> map;
	
	public ContactManager(){//初始化
		map = new TreeMap<String,ArrayList<Contact>>();
	}
//1. 添加
	public void addContact(Contact c){
		if (c.getName().equals("")||c.getPhone().equals("")) {
			System.out.println("信息不完全,添加失败");
		}else {
			ArrayList<Contact>list = map.get(c.getGroup());//获得该value--信息组
			if (list == null) {//该组不存在
				list = new ArrayList<Contact>();//初始化该组
				list.add(c);//将人添加到该组
				map.put(c.getGroup(), list);//将该键值放入map
				
			}else {
				list.add(c);//该组存在则直接放入	
			}
			System.out.println("添加成功");	
		}	
	}
//2. 获取某个分组下的所有联系人，并且按照姓名升序排列
	public ArrayList<Contact> getContacts_and_Sort_by_Group(String group) {
		ArrayList<Contact> list = map.get(group);
		if (list == null ) {
			System.out.println("该分组不存在");
		}else {
			NameComparator nC = new NameComparator();
			Collections.sort(list,nC);
		}
		return list;
	}
//3.根据电话号码搜索联系人(双重遍历)	
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
		System.out.println("没有此联系人");
		return null;
	}

//4. 获取所有女性联系人，并且按照年龄降序排列	
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
			System.out.println("没有性别为" + gender + "的联系人");
			return null;
		}else {
			AgeComparator cN =  new AgeComparator();
			Collections.sort(sexlist,cN);
			return sexlist;	
		}
		
	}

//5. 根据姓名删除联系人，考虑同名的情况
	public void deleteContact(String name) {
		String fN = PinYinUtil.getFirstSpell(name).substring(0,1).toUpperCase();
		ArrayList<Contact> list = map.get(fN);//得到该联系人所在分组容器list
		
		ArrayList<Contact> newlist = new ArrayList<Contact>();
		if (list == null) {//不存在此分组
			System.out.println("不存在此联系人");
		}else{//存在此分组
			if (list.size() == 1) { //分组联系人个数为1
				if (list.get(0).getName().equals(name)) {
					map.remove(fN);
					System.out.println( fN + " 组只有 " + name + " 一个联系人,已将该组删除" );
				}else {
				System.out.println("没有该联系人");	
					}
			}else{	//分组联系人个数>1
				for (int i = 0; i < list.size();i++) {
					if (list.get(i).getName().equals(name)) {
						newlist.add(list.get(i));//将同名的人放入容器newlist
					}	
				}
				System.out.println("有 " + newlist.size() + " 人名叫: " +name +
						"分别为: ");
				int j = 0;//选择要删除的联系人
				for(Contact contact : newlist) {
					System.out.println("("+ ++j + ") "+ contact.toString());
				}
				System.out.println("(0) 全部删除");
				System.out.println("您是要删除哪一个: (输入联系人序号)");
				Scanner scanner = new Scanner(System.in);
				int del = scanner.nextInt();
				scanner.close();
				if (del == 0) {
					list.removeAll(newlist);
					System.out.println("已全部删除");
				}else {
					list.removeAll(newlist);
					newlist.remove(del - 1);
					list.addAll(newlist);
					System.out.println("删除成功");
				}
	
			}
			if (list.size() == 0) {
				map.remove(fN);
				}
		}
	}
//6.删除某个分组下的所有联系人
	public void deletAll_in_Group (String group){
		if (map.get(group) == null) {
			System.out.println("不存在分组 "+ group);
		}else {
		map.remove(group);
		System.out.println("删除成功分组 " + group);
		}
	}
//7.展示所有联系人
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
