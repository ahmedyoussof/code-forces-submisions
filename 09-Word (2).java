import java.util.Scanner;

public class Word {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int upperCase = 0;
		int lowerCase = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLowerCase(str.charAt(i))) {
				lowerCase++;
			} else {
				upperCase++;
			}
		}
		if (lowerCase >= upperCase) {
			System.out.println(str.toLowerCase());
		} else {
			System.out.println(str.toUpperCase());
		}

	}
}
