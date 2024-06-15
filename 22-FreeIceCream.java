import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FreeIceCream {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long x = sc.nextLong();
		sc.nextLine();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}
		int distress = 0;
		for (int j = 0; j < str.length; j++) {
			char sign = str[j].charAt(0);
			Long number = Long.parseLong(str[j].substring(2));
			if (sign == '-') {
				if (x < number) {
					distress++;
				} else {
					x -= number;
				}
			}else {
				x += number;
			}
		}
		System.out.println(x + " " + distress);
	}
}
