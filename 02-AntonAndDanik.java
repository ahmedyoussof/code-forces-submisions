import java.util.Scanner;

public class AntonAndDanik {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		getWinner(n, s);

	}

	public static void getWinner(int n, String s) {

		int countA = 0;
		int countD = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				countA++;
			} else {
				countD++;
			}
		}
		if (countA > countD)
			System.out.println("Anton");
		else if (countD > countA)
			System.out.println("Danik");
		else
			System.out.println("Friendship");
	}

}
