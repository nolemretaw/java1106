package Homework;

public class Student extends Person {
	private String id;
	private String className;
	public void setId(String id){
		this.id = id;
		
	}
	public String getId(){
		return id;
	}
	public void setClass(String className) {
	this.className = className;
	}
	public String getClassName(){
		return className;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String gender , int age, String id, String className){
		super(name,gender, age);//继承父类.重写时要继承父类的方法就加super,
		//只有父类的实现,就只写super; 只实现自己的就不加super; 即实现自己的又要实现父类的重写,就先写super,再重写
		//自己的方法
		setId(id);
		setClass(className);
	}
	public void study(){
		System.out.println(getName() + "学习");
	}
	public String toString(){
		return "姓名: " + getName() + "性别: " + getGender() + "年龄: " + getAge() +
				"学号: " + getId() + "班级: " + getClassName();
	}
}
