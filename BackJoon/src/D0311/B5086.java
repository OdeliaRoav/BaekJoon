package D0311;

import java.util.Scanner;

public class B5086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	
		for(int i = 0; i<10000; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			if( a == 0 && b ==0 ) {
				break;
			}
			
			if(a % b == 0) {
				System.out.println("multiple");
			}
			else if(b % a == 0) {
				System.out.println("factor");
			}
			else {
				System.out.println("neither");
				
			}
		}
		
		
		
	}

}

// / 몫
// % 나머지