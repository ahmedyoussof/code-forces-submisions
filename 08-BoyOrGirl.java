import java.util.Scanner;

public class BoyOrGirl {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder name = new StringBuilder(s);
		int disChars = 0;
		for (int i = 0; i < name.length(); i++) {
			for (int j = i+1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					name.deleteCharAt(j);
				}
			}
		}
		if (name.length() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}

	}
}
