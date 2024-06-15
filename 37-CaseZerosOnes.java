import java.util.Scanner;

public class CaseZerosOnes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String x = str.replaceAll("[10]", "");
		System.out.println(x.length());

	}

}
