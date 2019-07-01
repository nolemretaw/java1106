package Homework;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("htr", "fale", 23);
		Student student = new Student("htr", "fale", 23, "12345", "12455");
		person.eat();
		student.eat();
		student.study();
		System.out.println(person.toString());
		System.out.println(student.toString());
	}

}
