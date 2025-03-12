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
			boolean d = true;
			
			int count = 0;
			int count1 = 0;
			int count2 = 0;
			int sum = 0;
			
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
			
			for(int i = 0; i<Array.length-1; i++) {
				sum = sum + Array[i];
			}
			
			if(sum == a) {
				d = true;
			}
			else {
				d = false;
			}
			
		
			if(d = true) {
				for(int i = 0; i<Array.length; i++) {
					if(Array[i] != 0) {
						count1++;
					}
				}
				
				System.out.print(a + " = ");
				for(int i = 0; i< count1-1; i++) {
					System.out.print(Array[i] + " + ");
					count2 ++ ;
					
					if(count2 == count1-2) {
						break;
					}
				}
				System.out.println(Array[count1-2]);
			}
			else {
				System.out.println(a + " is NOT perfect.");
			}
			
		}
		
		
	}

}
