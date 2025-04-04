package D0404;

import java.util.Scanner;

public class D3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x [] = new int[3];
		int y [] = new int[3];

		for(int i = 0; i<3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		for(int i = 0; i<3; i++) {
			System.out.println(x[i] + " " + y[i]);
		}
		
	}

}
