package q530;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		// System.out.println(inp);

		if (inp >= 20) {
			// 20살 이상일 경우
			System.out.println("adult");
		} else {
			// 그렇지 않은 경우
			int r = 20 - inp;
			System.out.println(r + " years later");
		}
	}
}
