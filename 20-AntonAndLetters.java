import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		String s = sc.nextLine();
		s = s.substring(1, s.length() - 1);
		for (Character c : s.toCharArray()) {
			if (c != ' ')
			set.add((int) c);
		}
		if(set.size() <= 1 ) System.out.println(set.size());
		
		else System.out.println(set.size() - 1);
	}
}
