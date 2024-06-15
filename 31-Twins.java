import java.util.Arrays;
import java.util.Scanner;

public class Twins {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		double count = 0;
		int pointer = 1;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			count += a[i];
		}
		Arrays.sort(a);
		double mine = a[a.length - 1];
		for (int i = 0; i < a.length; i++) {

			if (mine <= (count / 2)) {
				pointer++;
				mine += a[a.length - pointer];
			}
		}
		System.out.println(pointer);
	}

}
