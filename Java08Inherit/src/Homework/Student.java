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
		super(name,gender, age);//�̳и���.��дʱҪ�̳и���ķ����ͼ�super,
		//ֻ�и����ʵ��,��ֻдsuper; ֻʵ���Լ��ľͲ���super; ��ʵ���Լ�����Ҫʵ�ָ������д,����дsuper,����д
		//�Լ��ķ���
		setId(id);
		setClass(className);
	}
	public void study(){
		System.out.println(getName() + "ѧϰ");
	}
	public String toString(){
		return "����: " + getName() + "�Ա�: " + getGender() + "����: " + getAge() +
				"ѧ��: " + getId() + "�༶: " + getClassName();
	}
}
