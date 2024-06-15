import java.util.Scanner;

public class NightsWatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < max && a[i] > min) {
				count++;
			}

		}
		System.out.println(count);
	}

}