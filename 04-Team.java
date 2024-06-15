import java.util.Scanner;

public class Team {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[3];
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println(numOfProblems(n, a));

	}
	
	public static int numOfProblems(int n, int[][] a) {
		int numOfImplemented = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 2; j++) {
				if((a[i][j]) + (a[i][j+ 1]) + (a[i][j + 2]) >= 2) {
					numOfImplemented++;
				}
			}
		}
		return numOfImplemented;
	}
}
