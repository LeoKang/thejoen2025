package q515;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		// 1. println()
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		
		// 2. printf()
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		/*
		 * int : %d
		 * char : %c
		 * String : %s
		 * double : %f
		 */
	}

}
