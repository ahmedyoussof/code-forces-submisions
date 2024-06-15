import java.util.Scanner;

public class BearAndBigBrother {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(getYears(a, b));

	}
	
	public static int getYears(int a, int b) {

		int yearCounter = 1;
		int limakWeight = 3 * a;
		int bobWeight = 2 * b;
		while (limakWeight <= bobWeight) {
			yearCounter++;
			limakWeight *= 3;
			bobWeight *= 2;
		}
		return yearCounter;
	}
}
