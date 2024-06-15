import java.util.Scanner;

public class Word {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int upperCase = 0;
		int lowerCase = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals(str.substring(i, i + 1).toUpperCase())) {
				upperCase++;
			}
			else {
				lowerCase++;
			}
		}
		if (lowerCase >= upperCase) {
			System.out.println(str.toLowerCase());
		} else {
			System.out.println(str.toUpperCase());
		}
		
	}
}
