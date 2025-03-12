package D0311;

import java.util.Scanner;

public class B9506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			if(a == -1) {
				break;
			}
			
			int count = 0;
			
			int Array[] = new int[a];
			
			for(int i = 0; i<a; i++) {
				if(a%i == 0) {
					Array[i] = i+1;
				}	
				else if ( a == i ) {
					continue;
				}
			}
			
			
			
		}
		
		
		
	}

}
