package q613;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();

		Student student = new Student();
		student.setGrade(grade);
		student.setName(name);
		student.setSchool(school);

		student.print();
	}
}

class Student {
	private String name;
	private String school;
	private int grade;

	public void setName(String name) {
		this.name = name;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}
}
