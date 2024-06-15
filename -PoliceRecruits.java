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
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				cases++;
			} else {
				for (int j = i + 1; j < a.length - 1; j++) {
					if (a[j] < 0) {
						a[i] += a[j];
						if (a[i] == 0) {
							i = j;
							continue;
						}
					}
				}
			}
		}
		System.out.println(cases);
	}
}
