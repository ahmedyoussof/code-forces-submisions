import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IWannaBeTheGuy {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String y = sc.nextLine();
		String z = sc.nextLine();
		String s = y + " " + z;
		String[] nums = s.split("\\s+");
		
		Map<String, Integer> map = new HashMap<>();
		for (String i : nums) {
			if (!i.equals(" ") && !i.equals("0")) {
				if (!map.containsKey(i)) {
					map.put(i, 1);
				}
			}
		}
		
		if (map.size() == n) {
			System.out.println("I become the guy.");
		} else {
			System.out.println("Oh, my keyboard!");
		}
	}
	
}
