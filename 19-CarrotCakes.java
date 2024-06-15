import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CarrotCakes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int k = sc.nextInt();
		int d = sc.nextInt();
		int totalSingle = (n/k) * t;
		
		if (k > n) System.out.println("NO");
		else if(totalSingle > (d + t)) System.out.println("YES");
		else System.out.println("NO");
	}
}
