import java.util.Scanner;

public class SerejaAndDima {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int l = 0;
		int r = a.length - 1;
		int sereja = 0;
		int dima = 0;
		boolean right = true;
		while (l <= r) {
			if (right) {
				if(a[l] < a[r]) {
					sereja += a[r];
					r--;
					right = false;
				} else {
					sereja += a[l];
					l++;
					right = false;
				}
			} else {
				if(a[l] < a[r]) {
					dima += a[r];
					r--;
					right = true;
				} else {
					dima += a[l];
					l++;
					right = true;
				}
			}
		}
		System.out.println(sereja + " " + dima);
	}
}
