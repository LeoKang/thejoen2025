package q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 사용자 입력 처리
		Scanner sc = new Scanner(System.in);

		// 무한 loop
		for (;;) {
			char inp = sc.next().charAt(0);

			// 문자를 비교해서
			if ('A' <= inp && inp <= 'Z') {
				// 'A' 사이에 위치하는 문자 'Z'
				System.out.println(inp);
			} else if ('a' <= inp && inp <= 'z') {
				// 소문자 일 경우
				System.out.println(inp);
			} else if ('0' <= inp && inp <= '9') {
				// '0' '9' 사이에 위치하는 문자
				System.out.printf("%d\n", (int)inp);
			} else {
				// 위의 조건에 해당하지 않는 문자
				sc.close();
				break;
			}
		}
	}
}
