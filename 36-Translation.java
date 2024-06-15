import java.util.Scanner;

public class Translation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		StringBuilder r = new StringBuilder();
		for (int i = t.length() - 1; i >= 0; i--) {
			r.append(t.charAt(i));
		}
		if (r.toString().equals(s)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
}
