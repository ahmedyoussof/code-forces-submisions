import java.util.HashMap;
import java.util.Scanner;

public class Games {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		HashMap<Integer, Integer> countUniform = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int home = sc.nextInt();
			int guest = sc.nextInt();
			a[i] = guest;
			if (!countUniform.containsKey(home)) {
				countUniform.put(home, 1);

			} else {
				countUniform.put(home, countUniform.get(home) + 1);

			}

		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (countUniform.containsKey(a[i])) {
				sum += countUniform.get(a[i]);
			}
		}
		
		System.out.println(sum);
	}
}
