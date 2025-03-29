import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		while (true) {
			int num = sc.nextInt();
			list.add(num);
			if (num >= 100)
				break;
		}
		sc.close();

		int sum = 0;
		for (int num : list) {
			sum += num;
		}

		System.out.println(sum);
		System.out.printf("%.1f\n", (double) sum / list.size());
	}
}