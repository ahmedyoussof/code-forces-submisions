import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Juicer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int d = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x <= b) {
				a[i] = x;
			}
		}
		int sum = 0;
		int count = 0;
		
		for (int j = 0; j < a.length; j++) {
			sum += a[j];
			if(sum > d) {
				count++;
				sum = 0;
			}
		}
		System.out.println(count);
	}
}
