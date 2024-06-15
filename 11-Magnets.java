import java.util.Scanner;

public class Magnets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int groupSum = 1;
		for (int j = 0; j < a.length -1; j++) {
			if(a[j] != a[j + 1]) {
				groupSum++;
			}
		}
		System.out.println(groupSum);
	}
}
