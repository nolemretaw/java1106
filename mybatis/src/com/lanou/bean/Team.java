package com.lanou.bean;
/**Çò¶Ó*/
public class Team {
	private int tid;
	private String tname;
	private String location;
	private Coach coach;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	public Team(int tid, String tname, String location, Coach coach) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.location = location;
		this.coach = coach;
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + ", location=" + location + "]";
	}
	
}
