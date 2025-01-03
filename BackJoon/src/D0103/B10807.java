package D0103;

import java.util.Scanner;

public class B10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int Array[] = new int[a];

		
		for(int i = 0; i<a; i++) {
			Array[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		
		int count = 0;
		
		for(int i = 0 ; i < a; i++) {
			if(b == Array[i]) {
				count++;
			}
		}
		System.out.print(count);
	}

}
