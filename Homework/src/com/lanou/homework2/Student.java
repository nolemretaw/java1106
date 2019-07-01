package com.lanou.homework2;

public class Student {
	private String id;
	private String name;
	private String classId;
	private int score;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(String id, String name, String classId, int score) {
		super();
		this.id = id;
		this.name = name;
		this.classId = classId;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", classId=" + classId + ", score=" + score + "]";
	}
	
}
