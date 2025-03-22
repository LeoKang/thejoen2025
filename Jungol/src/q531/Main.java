package q531;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp = sc.nextDouble();
		sc.close();

		System.out.println(inp);

		if (inp <= 50.8) {
			System.out.println("Flyweight");
		} else if (inp <= 61.23) {
			System.out.println("Lightweight");
		} else if (inp <= 72.57) {
			System.out.println("Middleweight");
		} else if (inp <= 88.45) {
			System.out.println("Cruiseweight");
		} else {
			System.out.println("Heavyweight");
		}
	}
}
