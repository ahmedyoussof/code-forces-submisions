import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class NewPassword {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder pass = new StringBuilder();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (i < k) {
				pass.append(alpha.charAt(i));
			}
			if (i >= k && i < n && j < k) {
				pass.append(pass.charAt(j));
				j++;
			}
			if (j == k) {
				j = 0;
			}
		}
		System.out.println(pass);
	}
}
