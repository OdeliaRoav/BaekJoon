package D0311;

import java.util.Scanner;

public class B9506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		for(int i = 0; i<100000; i++) {
			int a = sc.nextInt();
			int Array[] = new int[a];
			int count = 0;
			
			if(a == -1) {
				break;
			}
			else {
				for(int j = 0; j<a; j++) {
					if(a % (j+1) == 0) {
						Array[count] = j+1;
						count++;
					}
					
				}
				
				
				
				
				
			}
			
		}
	
	}

}
