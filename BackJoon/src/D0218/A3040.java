package D0218;

import java.util.Scanner;

public class A3040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int a [] = new int[9];
		int total = 0;
		
		for(int i = 0; i<9; i++) {
			a[i] = sc.nextInt();
			total += a[i];
		}
		
		for(int i = 0; i<9; i++) {
			for(int j = i+1; j<9; j++) {
				if(total - a[i] - a[j] == 100) {
					for(int k = 0; k<9; k++) {
						if(k != i && k!= j) {
							System.out.println(a[k]);
						}
					}
				}
			}
		}
		
		
		
	}

}
