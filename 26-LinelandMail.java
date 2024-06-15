import java.util.Scanner;

public class LinelandMail {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int min = 0, max = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				min = Math.abs(a[i] - a[i + 1]);
				max = Math.abs(a[i] - a[a.length - 1]);
				
			} else if (i == (a.length - 1)) {
				
				min = Math.abs(a[i] - a[a.length - 2]);
				max = Math.abs(a[i] - a[0]);
				
			} else {
				
				if ((Math.abs(a[i] - a[i + 1])) > (Math.abs(a[i] - a[i - 1]))) {
					min = (Math.abs(a[i] - a[i - 1]));
				} else {
					min = (Math.abs(a[i] - a[i + 1]));
				}
				if ((Math.abs(a[i] - a[0])) > (Math.abs(a[i] - a[a.length - 1]))) {
					max = (Math.abs(a[i] - a[0]));
				} else {
					max = (Math.abs(a[i] - a[a.length - 1]));
				}
			}
			System.out.println(min + " " + max);
		}
	}
	
}
