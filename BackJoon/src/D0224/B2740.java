package D0224;

import java.util.Scanner;

public class B2740 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
			
		int Array[][] = new int[a][b];
		
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<b; j++) {
				Array[i][j] = sc.nextInt();
			}
		}
		int c = sc.nextInt();
		int d = sc.nextInt();
		int Array2[][] = new int[c][d];
			
		for(int i = 0; i<c; i++) {
			for(int j = 0; j<d; j++) {
				Array2[i][j] = sc.nextInt();
			}
		}

		if(b == c) {
			int Array3[][] = new int[a][d];
			
			for(int i = 0; i<a; i++) {
				for(int j = 0; j<d; j++) {
					int sum = 0;
					for(int t = 0; t<b; t++) {
						sum += Array[i][t] * Array2[t][j];
					}
					Array3[i][j] = sum;
				}
			}
			
			for(int i = 0; i<a; i++) {
				for(int j = 0; j<d; j++) {
					System.out.print(Array3[i][j] + " ");
				}
				System.out.println();
			}
			
		}
		else {
			System.out.print("error");
		}
		
	}

}
