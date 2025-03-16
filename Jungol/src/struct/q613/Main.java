package struct.q613;

import java.util.Scanner;

class Person {
	private String name;
	private String school;
	private int grade;
	private int ban;

	public Person(String name, String school, int grade, int ban) {
		this.name = name;
		this.school = school;
		this.grade = grade;
		this.ban = ban;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
		System.out.println("Ban : " + ban);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		int ban = sc.nextInt();


//		System.out.println("Name : " + name);
//		System.out.println("School : " + school);
//		System.out.println("Grade : " + grade);
		
		Person p1 = new Person(name, school, grade, ban);
		
		name = sc.next();
		school = sc.next();
		grade = sc.nextInt();
		ban = sc.nextInt();
		sc.close();
		
		Person p2 = new Person(name, school, grade, ban);
		p1.print();
		p2.print();
	}
}
