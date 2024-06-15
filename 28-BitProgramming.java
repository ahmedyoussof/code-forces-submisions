import java.util.Scanner;

public class BitProgramming {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		int x = 0;
		for (int j = 0; j < str.length; j++) {
			
			if(str[j].equalsIgnoreCase("x++") || str[j].equalsIgnoreCase("++x")) {
				x++;
			} else if(str[j].equalsIgnoreCase("x--") || str[j].equalsIgnoreCase("--x")){
				x--;
			}
		}
		System.out.println(x);
	}

}
