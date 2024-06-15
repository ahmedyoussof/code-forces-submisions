import java.util.Scanner;

public class ZerosOnes {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int zeros = 0;
		int ones = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') zeros++;
			else ones++;
		}
		System.out.println(Math.abs(ones - zeros));
	}
}
