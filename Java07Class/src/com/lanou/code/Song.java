package com.lanou.code;

public class Song {
	//����˽��
	private String name;
	private String thing;
	
	public void sing(String music) {
		System.out.println(name + "���ڳ�" + music);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//����
	public static void setThing(String thing) {
		Song.setThing(" ");
	}
}
