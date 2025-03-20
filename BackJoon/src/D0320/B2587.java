package D0320;

import java.util.Scanner;
import java.util.Arrays;

public class B2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int[5];
		int sum = 0;
		
		
		for(int i = 0; i<5; i++) {
			Array[i] = sc.nextInt();	
			sum = sum + Array[i];
		}
		
		Arrays.sort(Array);
		
		System.out.println(sum/5);
		System.out.println(Array[2]);
		
		
		
		
	}

}
