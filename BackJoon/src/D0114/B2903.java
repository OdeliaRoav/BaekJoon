package D0114;

import java.util.Scanner;

public class B2903 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = 2;
		int c = 1;
		
		for(int i = 1; i<a; i++) {
			b = b*2;
		}
		c = c+b;
		
		System.out.print(c*c);
		
		
	}

}
