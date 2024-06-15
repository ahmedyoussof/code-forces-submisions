import java.util.Scanner;

public class YoungPhysicist {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][3];
		int first = 0;
		int second = 0;
		int third = 0;
		for (int i = 0; i < a.length; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
			a[i][2] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			first += a[i][0];
			second += a[i][0];
			third += a[i][0];
		}
		if (first == 0 && second == 0 && third == 0) {

			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
