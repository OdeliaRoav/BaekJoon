package D0113;

import java.util.Scanner;

public class B2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int reverse = 0;
		int reverse2 = 0;

		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		while (num2 != 0) {
			int digit = num2 % 10;
			reverse2 = reverse2 * 10 + digit;
			num2 /= 10;
		}
		if(reverse>reverse2) {
			System.out.println(reverse);
			
		}
		else if(reverse<reverse2) {
			System.out.println(reverse2);
		}
		
		
		
	}

}
