package D0225;

import java.util.Scanner;

public class A25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0; 
		
		for(int i = 0; i<b; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			sum += c * d;
		}
		
		if( sum == a) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
		
	}

}
