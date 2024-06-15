import java.util.Scanner;

public class StringTask {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toLowerCase();
		String[] strs = s.split("[aoyieu]");
		StringBuilder x = new StringBuilder();
		for (int i = 0; i < strs.length; i++) {
			x.append(strs[i]);
		}
		for (int i = 0; i < x.length(); i++) {
			System.out.print("." + x.charAt(i));
		}
	}
	
}
