package com.lanou.bean;
/**����*/
public class Coach {
	private int cid;
	private String cname;
	//����ִ�̵����	
	private Team team;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Coach(int cid, String cname, Team team) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.team = team;
	}
	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Coach [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
