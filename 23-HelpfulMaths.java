import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HelpfulMaths {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < str.length(); i += 2) {
			if (str.charAt(i) == '1') {
				sb1.append(str.charAt(i) + "+");
			} else if (str.charAt(i) == '2') {
				sb2.append(str.charAt(i) + "+");
			} else {
				sb3.append(str.charAt(i) + "+");
			}
		}

		if (sb1.length() == 0 && sb2.length()== 0) {
			System.out.print(sb3.substring(0, sb3.length() - 1));
		} else if (sb2.length() == 0 && sb3.length()== 0) {
			System.out.print(sb1.substring(0, sb1.length() - 1));
		} else if (sb1.length() == 0 && sb3.length()== 0) {
			System.out.print(sb2.substring(0, sb2.length() - 1));
		}else if (sb1.length() != 0 && sb2.length() != 0 && sb3.length() == 0) {
			System.out.println(sb1.substring(0, sb1.length() - 1) + "+" + sb2.substring(0, sb2.length() - 1));
		}
		else {

			if (sb1.length() > 0)
				System.out.print(sb1.substring(0, sb1.length() - 1) + "+");
			if (sb2.length() > 0)
				System.out.print(sb2.substring(0, sb2.length() - 1) + "+");
			if (sb3.length() > 0)
				System.out.println(sb3.substring(0, sb3.length() - 1));
		}

	}
}
