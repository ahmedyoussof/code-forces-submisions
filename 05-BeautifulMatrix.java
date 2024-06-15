import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] a = new int[5][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[5];
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println(numOfMoves(a));

	}
	
	public static int numOfMoves(int[][] a) {
		int minNum = 0;
		int iPoss = 0;
		int jPoss = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 1) {
					iPoss += i;
					jPoss += j;
				}
			}
		}
		while(true) {
			if (iPoss < 2) {
				minNum++;
				iPoss++;
			}
			else if (iPoss > 2) {
				minNum++;
				iPoss--;
			}
			if (jPoss < 2) {
				minNum++;
				jPoss++;
			}
			else if (jPoss > 2) {
				minNum++;
				jPoss--;
			}
			if (iPoss == 2 && jPoss == 2) break;
		}
		return minNum;
	}
}
