package D0106;

import java.util.Scanner;

public class B10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[][] = new int[5][];
		
		for(int i = 0; i< 5; i++) {
			for(int j = i;; j++) {
				Array[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i< 5; i++) {
			for(int j = i;; j++) {
				System.out.println(Array[i][j]);
			}
		}
		
		
		
	}

}
