import java.util.Scanner;

public class GravityFlip {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int x = 0; x < a.length; x++) {
			a[x] = sc.nextInt();

		}
		int minIndex = 0;
		int maxValue = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[i]) {
					minIndex = j;
					maxValue = a[i];
					a[i] = a[minIndex];
					a[j] = maxValue;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}
	}
}
