package com.lanou.code;

public class Song {
	//属性私有
	private String name;
	private String thing;
	
	public void sing(String music) {
		System.out.println(name + "正在唱" + music);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//独有
	public static void setThing(String thing) {
		Song.setThing(" ");
	}
}
