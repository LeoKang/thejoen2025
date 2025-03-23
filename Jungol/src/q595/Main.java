package q595;

public class Main {
	public static void main(String[] args) {
		String str = "Hong Gil Dong";

		// 1.
		for (int i = 3; i <= 6; i++) {
			char c = str.charAt(i);
			System.out.print(c);
		}
		System.out.println();
		
		// 2.
		String sstr = str.substring(3, 7);
		System.out.println(sstr);
	}
}
