package D0109;

import java.util.Scanner;

public class B3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int chess[] = {1, 1, 2, 2, 2, 8};
		int Array[] = new int[6];
		

		
		for(int i = 0; i<6; i++) {
			Array[i] = sc.nextInt();
				
			int a = chess[i] - Array[i];
			
			Array[i] = a;
			
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(Array[i] + " ");
		}
		
		
		
		
	}

}
