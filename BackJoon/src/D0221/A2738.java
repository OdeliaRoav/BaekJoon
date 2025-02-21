package D0221;

import java.util.Scanner;

public class A2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int Array[][] = new int[a][b];
		int Array2[][] = new int[a][b];
		int Array3[][] = new int[a][b];
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j<b; j++) {
				Array[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < a; i++) {
			for(int j = 0; j<b; j++) {
				Array2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<b; j++) {
				Array3[i][j] = Array[i][j]+Array2[i][j];
			}
		}
		
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<b; j++) {
				System.out.print(Array3[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
