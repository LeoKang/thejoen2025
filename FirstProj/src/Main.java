import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = sc.nextInt();
		sc.close();

		int index = s.length() - 1;

		while (i != 0) {
			System.out.print(s.charAt(index--));
			i--;
			if (index < 0)
				break;
		}
	}
}