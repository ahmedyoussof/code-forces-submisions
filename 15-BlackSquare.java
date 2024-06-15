import java.util.Scanner;

public class BlackSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		for (int i = 0; i < 4; i++) {
			a[i] = sc.nextInt();
		}
		String str = sc.next();
		int calories = 0;
		for (char c : str.toCharArray()) {
			int charValue = Character.getNumericValue(c);
			calories += a[charValue - 1];
		}
		System.out.println(calories);
	}
}
