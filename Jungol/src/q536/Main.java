package q536;

public class Main {
	public static void main(String[] args) {
// 1. for
		for (int i = 1; i <= 15; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

// 2. while
		int j = 1;
		while (j <= 15) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println();

// 3. do ~ while
		int k = 1;
		do {
			System.out.print(k++ + " ");
		} while (k <= 15);
	}
}
