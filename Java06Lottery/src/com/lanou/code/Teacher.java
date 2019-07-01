package com.lanou.code;

public class Teacher {
//特征:属性 ;行为:方法
		String name;
		String gender;
		int age;
		float salary;
		public void smoke(String cigeratte){
			System.out.println(name + "正在抽" + cigeratte);
		}
		public void watch(String filmName) {
			System.out.println(name + "正在看" + filmName);
		}
		public void teach() {
			System.out.println("姓名 : " + name + 
					", 性别 , " + gender + ", 年龄 , " + age + 
					", 薪水 , " + salary);
		}
}
