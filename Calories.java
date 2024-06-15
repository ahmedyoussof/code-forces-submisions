import java.util.Scanner;

public class Calories {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strips = sc.nextLine();
		char[] calories = str.toCharArray(); 
		int countCaloris = 0;
		for (int i = 0; i < calories.length; i++) {
			if(calories[i] != ' ') {
			char c = calories[i];
			countCaloris += Character.getNumericValue(c);
			}
		}
		System.out.println(countCaloris);
	}
}
