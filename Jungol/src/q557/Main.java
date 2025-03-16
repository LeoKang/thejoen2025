package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] inp = new char[10];
		for (int i = 0; i < inp.length; i++) {
//			inp[i] = sc.next().charAt(0);

			String s = sc.next();
			inp[i] = s.charAt(0);
		}
		sc.close();

		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
		System.out.println();

		System.out.print(inp[0] + " ");
		System.out.print(inp[3] + " ");
		System.out.print(inp[6]);
		System.out.println();

		// A B C D E F G H I J
		for (int i = 1; i < inp.length; i += 2) { // i = i + 2;
			System.out.print(inp[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < inp.length; i++) {
			if (i % 2 == 0) {
				System.out.print(inp[i] + " ");
			}
		}
	}
}
