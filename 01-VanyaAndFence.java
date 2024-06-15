import java.util.Scanner;

public class VanyaAndFence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(validWidth(n, h, a));

	}

	public static int validWidth(int n, int h, int[] a) {
		if (n >= 1 && n <= 1000 && h >= 1 && h <= 1000) {
			int counter = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] >= 1 && a[i] <= 2 * h) {
					if (a[i] <= h) {
						counter++;
					} else {
						counter += 2;
					}
				}
			}
			return counter;
		}
		return -1;
	}

}
