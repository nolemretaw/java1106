package com.lanou.jdbc;

import java.io.Serializable;
import java.util.Date;

/**数据库中每存在一张表，都应该对应java中一个实体类，
 * 表的字段对应实体类的属性，每一行记录对应实体类的一个对象
 * ORM:Object Relation Mapping(对象关系映射)
 * */
public class Emp implements Serializable{
	private int id;
	private String name;
	private String sex;
	private String job;
	private double salary;
	private Date hiredate;
	private int deptno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public Emp(int id, String name, String sex, String job, double salary, Date hiredate, int deptno) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.job = job;
		this.salary = salary;
		this.hiredate = hiredate;
		this.deptno = deptno;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sex=" + sex + ", job=" + job + ", salary=" + salary
				+ ", hiredate=" + hiredate + ", deptno=" + deptno + "]";
	}
}
