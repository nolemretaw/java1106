package com.lanou.bean;

public class Card {
	private int  cid;
	private String cno;
	private String remark;
	//代表当前card属于哪个people
	private People people;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public Card(int cid, String cno, String remark, People people) {
		super();
		this.cid = cid;
		this.cno = cno;
		this.remark = remark;
		this.people = people;
	}
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Card [cid=" + cid + ", cno=" + cno + ", remark=" + remark + "]";
	}
	
}
