package com.lanou.code;

public class Teacher {
//����:���� ;��Ϊ:����
		String name;
		String gender;
		int age;
		float salary;
		public void smoke(String cigeratte){
			System.out.println(name + "���ڳ�" + cigeratte);
		}
		public void watch(String filmName) {
			System.out.println(name + "���ڿ�" + filmName);
		}
		public void teach() {
			System.out.println("���� : " + name + 
					", �Ա� , " + gender + ", ���� , " + age + 
					", нˮ , " + salary);
		}
}
