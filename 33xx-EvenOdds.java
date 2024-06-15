import java.util.Scanner;

public class EvenOdds {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long size = sc.nextLong();
		long index = sc.nextLong();
		StringBuilder odd = new StringBuilder();
		StringBuilder even = new StringBuilder();
		for (long i = 0; i < size; i++) {
			if (i % 2 == 0) {
				odd.append(i + 1);
			} else {
				even.append(i + 1);
			}
		}
		String total = odd + "" + even;
		System.out.println(total.charAt((int) (index - 1)));
	}
	
}
