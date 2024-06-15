import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BrainsPhotos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 0; i < (n * m); i++) {
			String c = sc.next();

			if (c.equals("M") || c.equals("C") || c.equals("Y")) {
				System.out.println("#Color");
				return;
			}
		}

		System.out.println("#Black&White");

	}
}
