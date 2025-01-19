package D0119;

import java.util.Scanner;

public class AA3040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int [9];
		int sum = 0;
		
		for(int i = 0; i<9; i++) {
			Array[i] = sc.nextInt();
			sum = sum + Array[i];
		}
		
		for(int i = 0; i<9; i++) {
			for(int j = i+1; j<9; j++) {
				if(sum - Array[i] - Array[j] ==100) {
					for(int c = 0; c<9; c++) {
						if(c!=i && c!=j) {
							System.out.println(Array[c]);
						}
					}
				}
			}
		}
		
		
	}

}
