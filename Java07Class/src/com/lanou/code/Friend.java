package com.lanou.code;

public class Friend {
	String name;
	String hobby;
	
	public void smoke(String cigerate) {
		System.out.println(name + "���ڳ�" + cigerate);
	}
	public void eat(String food) {
		System.out.println(name + "���ڳ�" + food);
	}
	
	public static void main(String[] args) {
		Friend friend = new Friend();
		friend.name = "����";
		friend.hobby = "��Ǯ";
		friend.smoke("�ƺ�¥1916");
		friend.eat("ţ��,����");
		
		
	}
}
 