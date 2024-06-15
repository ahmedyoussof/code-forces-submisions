import java.util.Scanner;

public class BearAndBigBrother {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(getYears(a, b));

	}
	
	public static int getYears(int a, int b) {

		int yearCounter = 0;
		while (a <= b) {
			yearCounter++;
			a *= 3;
			b *= 2;
		}
		return yearCounter;
	}
}
