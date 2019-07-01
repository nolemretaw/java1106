package com.lanou.code;

public class Friend {
	String name;
	String hobby;
	
	public void smoke(String cigerate) {
		System.out.println(name + "ÕıÔÚ³é" + cigerate);
	}
	public void eat(String food) {
		System.out.println(name + "ÕıÔÚ³Ô" + food);
	}
	
	public static void main(String[] args) {
		Friend friend = new Friend();
		friend.name = "ÂíÔÆ";
		friend.hobby = "¿ÓÇ®";
		friend.smoke("»Æº×Â¥1916");
		friend.eat("Å£ÅÅ,±«Óã");
		
		
	}
}
 