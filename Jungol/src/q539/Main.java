package q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int cnt = 0;
		while (true) {
			int inp = sc.nextInt();

			sum = sum + inp;	// sum += inp;
			cnt = cnt + 1;		// cnt ++;
			
			if (inp >= 100) {
				break;
			}
			
		}
		sc.close();
		
		double avg = (double)sum / cnt;
		
		System.out.println(sum);
		System.out.printf("%.1f\n", avg);
	}
}
