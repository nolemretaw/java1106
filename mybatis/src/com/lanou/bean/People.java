package com.lanou.bean;

import java.util.List;

public class People {
	private int uid;
	private String uname;
	//代表一个people对应多张card
	private List<Card> cards;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public People(int uid, String uname, List<Card> cards) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.cards = cards;
	}
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "People [uid=" + uid + ", uname=" + uname + "]";
	}
	
}
