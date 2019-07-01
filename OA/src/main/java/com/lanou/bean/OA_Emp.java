package com.lanou.bean;

import java.io.Serializable;

public class OA_Emp implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8039370770004541145L;
	private int id;
	private String username;
	private String name;
	private String gender;
	private String section;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public OA_Emp(int id, String username, String name, String gender, String section, String email) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.gender = gender;
		this.section = section;
		this.email = email;
	}
	
	public OA_Emp() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OA_Emp [id=" + id + ", username=" + username + ", name=" + name + ", gender=" + gender + ", section="
				+ section + ", email=" + email + "]";
	}
	
	
}
