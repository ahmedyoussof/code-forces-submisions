import java.util.Scanner;

public class Keyboard {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String dir = sc.next();
		String layout = "qwertyuiopasdfghjkl;zxcvbnm,./";
		String input = sc.next();
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (dir.equals("R")) {
				if (input.charAt(i) == layout.charAt(0)) {
					output.append(layout.charAt(layout.length() - 1));
				} else {
					output.append(layout.charAt(layout.indexOf(input.charAt(i)) - 1));
					
				}
			} else {
				if (input.charAt(i) == layout.charAt(layout.length() - 1)) {
					output.append(layout.charAt(0));
				} else {
					output.append(layout.charAt(layout.indexOf(input.charAt(i)) + 1));
					
				}
			}
		}
		System.out.println(output);
	}
	
}
