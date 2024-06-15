import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WayTooLongWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		for (String s : str) {
			if(s.length() > 10) {
				System.out.println(s.charAt(0) + "" +(s.length()-2) + "" + s.charAt(s.length()-1));
			}
			else System.out.println(s);
		}
	}
}
