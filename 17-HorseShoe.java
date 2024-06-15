import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HorseShoe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		HashMap <Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], 0);

			} else {
				map.put(a[i], map.get(a[i]) + 1);

			}
		}
		for (Integer i : map.values()) {
			if (i > 0) count += i;
		}
		System.out.println(count);
	}
}
