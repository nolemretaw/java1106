package com.lanou.code;

/*
 	������ �������Դ���ġ�
 */
public class Initial {
	
	public static void main(String[] args) {
		//��������
		//���� ������ = new ���췽��;
		//�������� ������ = ��ֵ; int a = 10;
		/*
		 	new�ؼ�����������������ģ�����������ڶ���
		 	person�Ǳ�������Ҳ������Ϊ�Ƕ�����������ջ��
		 	person�洢���Ƕ����ڶ����ĵ�ַ�����Բ���
		 	person���൱�ڲ���������
		 	
		 	ֻҪ��new�����Ķ��������ڲ�����һ��
		 	�����ڶ����еĵ�ַҲ��һ��
		 */
		Person person = new Person();
		person.name = "����";
		person.gender = "��";
		person.age = 18;
		person.height = 180.0;
		
		Person person1 = new Person();
		person1.name = "����";
		person1.gender = "��";
		person1.age = 18;
		person1.height = 180.0;
		
		System.out.println(person);
		System.out.println(person1);
		
		//���ж��󷽷��ĵ����﷨: ������.����
		person.introduce();
		
		//����һ��ѧ������
		Student student = new Student();
		System.out.println(student);
		student.setName("��ѡ");
		System.out.println(student.getName());
		student.introduce();
		
	}
}












