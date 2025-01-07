package D0107;

import java.util.Scanner;

public class B2720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int Array[] = {25, 10, 5, 1};
		
		int count = 0;
		
		
		
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			
			for(int j = 0; j < 4; j++) {
				System.out.print(b/Array[j] + " ");
				b %= Array[j];
			}
			System.out.println();
		}
		
	}

}
