import java.util.Scanner;

public class Presents {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int j = 1;
		int[] b = new int[n];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == j) {
				b[j-1] = i+1;
				i = -1;
				j++;
			}
		}
		for (int k = 0; k < b.length; k++) {
			System.out.print(b[k] + " ");
		}
	}
}
