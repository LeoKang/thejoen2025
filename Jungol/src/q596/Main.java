package q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		sc.close();

		if (num > str.length()) {
			for (int i = str.length() - 1; i >= 0; i--) {
				char c = str.charAt(i);
				System.out.print(c);
			}
		} else {
			int cnt = 0;
			for (int i = str.length() - 1; cnt < num; i--) {
				char c = str.charAt(i);
				cnt++;
				System.out.print(c);
			}
		}
	}
}
