import java.util.Scanner;

public class Games {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		for(int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		int count = 0;
		for (int j = 0; j < a.length; j++) {
			for (int k = 0; k < a.length; k++) {
				
				if (a[j][1] == a[k][0]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
