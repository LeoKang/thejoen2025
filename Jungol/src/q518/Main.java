package q518;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);

		int sum = 0;
		sum = a + b + c;
		System.out.println("sum : " + sum);
		int avg = sum / 3;
		System.out.println("avg : " + avg);
	}
}




