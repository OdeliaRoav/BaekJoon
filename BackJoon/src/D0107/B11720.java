package D0107;

import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0 ;
		String b = sc.next();
		
		for(int i = 0; i<a; i++) {
			
			int c = b.charAt(i) - 48;
			
			sum += c;
			
		
		}
		System.out.print(sum);
		
		
		
		
	}

}
