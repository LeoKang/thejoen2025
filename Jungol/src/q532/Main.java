package q532;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp1 = sc.nextDouble();
		double inp2 = sc.nextDouble();
		sc.close();

		if (inp1 >= 4.0 && inp2 >= 4.0) {
			System.out.println("A");
		} else if (inp2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}
