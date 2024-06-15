import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String team = sc.next();
			if (!map.containsKey(team)) {
				map.put(team, 1);
			} else {
				map.put(team, map.get(team)+1);
			}
		}
		int max = 0;
		String winner = null;
		for (String s : map.keySet()) {
			if (map.get(s) > max) {
				max = map.get(s);
				winner = s;
			}
		}
		System.out.println(winner);
	}
}
