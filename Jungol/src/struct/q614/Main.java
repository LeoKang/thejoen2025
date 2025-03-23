package struct.q614;

import java.util.Scanner;

class Student {
	private String schoolName;
	private int grade;
	
	public Student(String schoolName, int grade) {
		this.schoolName = schoolName;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(grade + " grade in "
	+ schoolName + " school");
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student st1 = new Student("Jejuelementary", 6);
		
		String schoolName = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student st2 = new Student(schoolName, grade);
		
		st1.print();
		st2.print();
	}
}
