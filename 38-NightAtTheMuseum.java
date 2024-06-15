import java.util.Scanner;

public class NightAtTheMuseum {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String input = sc.next();
		int curr = 0;
		int next = 0;
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			if (i == 0) {
				curr = alpha.indexOf('a') + 1;
				next = alpha.indexOf(input.charAt(i)) + 1;
				if (next > curr) {
					result += Math.min((next - curr), (curr + (26 - next)));
				} else {
					result += Math.min((curr - next), ((26 - curr) + next));
				}
				
			}else {
				curr = alpha.indexOf(input.charAt(i - 1)) + 1;
				next = alpha.indexOf(input.charAt(i)) + 1;
				if (next > curr) {
					result += Math.min((next - curr), (curr + (26 - next)));
				} else {
					result += Math.min((curr - next), ((26 - curr) + next));
				}
			}
		}
		System.out.println(result);
		sc.close();
	}
}
