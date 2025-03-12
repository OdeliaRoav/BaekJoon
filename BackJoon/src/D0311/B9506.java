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
			int count1 = 0;
			
			int Array[] = new int[a];
			
			for(int i = 0; i<a; i++) {
				if(a % (i+1) == 0) {
					Array[count] = i+1;
					count++;
				}	
				else if ( a == i ) {
					continue;
				}
				
			}
			
		
			
			for(int i = 0; i<Array.length; i++) {
				if(Array[i] != 0) {
					count1++;
				}
			}
			
			for(int i = 0; i<count1-1; i++) {
				System.out.print(Array[i] + " ");
			}
			
		}
		
		
		
	}

}
