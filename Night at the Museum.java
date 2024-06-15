import java.util.Scanner;

public class NightAtTheMuseum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String input = sc.next();
		int start = 0;
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			
				start = alpha.indexOf(input.charAt(i - 1)) + 1;
				
				int pointer = alpha.indexOf(input.charAt(i)) + 1;
				int rightDist = Math.abs(start - pointer);
				int leftDist = Math.abs((26 - pointer) + start);
				if (rightDist < leftDist) {
					result += rightDist;
				} else {
					result += leftDist;
				}
			
			
		}
		System.out.println(result);
		
	}
	
}




import java.util.Scanner;

public class CaseZerosOnes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String x = str.replaceAll("[10]", "x");
		System.out.println(x);

	}
}
