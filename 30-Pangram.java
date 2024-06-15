import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pangram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String alpha = "[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]";
		int n = sc.nextInt();
		String str = sc.next().toLowerCase();
		char[] input = str.toCharArray();
		Set<Character> tree = new TreeSet<>();
		for (char c : input) {
			tree.add(c);
		}
		System.out.println(tree.toString());
		if (alpha.equals(tree.toString())) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
