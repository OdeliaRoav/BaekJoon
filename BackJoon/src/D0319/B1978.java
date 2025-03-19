package D0319;

import java.util.Scanner;

public class B1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int Array[] = new int[a];
		int count = 0;
		
		
		
		for(int i = 0; i<Array.length; i++) {
			int b = sc.nextInt();
			
			for(int j = 2; j <= a/2; j++) {
	        	if(a%j == 0) {
					count ++;
				}
			}
				
		}
		
		System.out.println(count-1);		
		
		
	}

}
