package com.lanou.bean;

import java.io.Serializable;

public class User1 implements Serializable{
	//属性名和字段名不一致
	private int uid;
	private String name;
	private String pwd;
	private int uage;
	private String sex;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User1(int uid, String name, String pwd, int uage, String sex) {
		super();
		this.uid = uid;
		this.name = name;
		this.pwd = pwd;
		this.uage = uage;
		this.sex = sex;
	}
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User1 [uid=" + uid + ", name=" + name + ", pwd=" + pwd + ", uage=" + uage + ", sex=" + sex + "]";
	}
	
}
