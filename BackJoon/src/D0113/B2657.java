package D0113;

import java.util.Scanner;

public class B2657 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int count = 0;
		
		while(count<=2) {
			int b = sc.nextInt();
			String c = sc.next();
			
			for(int i = 0; i<c.length(); i++) {
				for(int j = 0; j<b; j++) {
					System.out.print(c.charAt(i));
				}
			}
			count++;
			System.out.println();
		}
		
	}

}
