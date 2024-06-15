import java.util.Scanner;

public class PetyaAndStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		first = first.toLowerCase();
		second = second.toLowerCase();
		
		for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) == second.charAt(i)) {
				if( i == first.length()-1) {
					System.out.println(0);
				}
				continue;
			}
			else if (first.charAt(i) > second.charAt(i)) {
				System.out.println(1);
				break;
				
			}else if (first.charAt(i) < second.charAt(i)) {
				System.out.println(-1);
				break;
			} 
		}
		

	}
}
