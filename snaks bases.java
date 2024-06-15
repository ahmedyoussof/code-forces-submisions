import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LinelandMail {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			list.add(a[i]);
		}
		Collections.sort(list);
		StringBuilder str = new StringBuilder();
		int r = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != list.get(list.size() - r)) {
				str.insert(0, a[i]);
				str.insert(0, " ");
				System.out.println();
			} else {
				str.insert(0, a[i]);
				System.out.println(str);
				r = r + 1 + i ;
				str = new StringBuilder();
			}

		}
		System.out.print(str);
	}

}
