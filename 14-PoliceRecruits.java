import java.util.Scanner;

public class PoliceRecruits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int cases = 0;
		int employee = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				employee += a[i];
			} else if (employee != 0) {
				employee += a[i];
			} else {
				cases++;
			}
		}
		System.out.println(cases);
	}
}
