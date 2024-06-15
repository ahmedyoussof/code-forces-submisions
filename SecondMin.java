import java.util.HashMap;
import java.util.Scanner;

public class SecondMin {

	public static void main(String[] args) {

		
		int[] a = {1, 11, 33, 11, 4, 5};
		int firstMin = a[0];
		int secondMin = a[0];
		for (int i = 0; i < a.length; i++) {
			if (firstMin > a[i])
				firstMin = a[i];	
		} 
		for (int j = 0; j < a.length; j++) {
			
			if (firstMin < a[j])
				if(secondMin > a[j]) {
				secondMin = a[j];
			}
		}
		System.out.println(firstMin + " " + secondMin);
	}
}
