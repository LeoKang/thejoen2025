package q528;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inp = scan.nextInt();
		scan.close();
		
		System.out.println(inp);
		
		if(inp < 0) {
			System.out.println("minus");
		}
	}
}
