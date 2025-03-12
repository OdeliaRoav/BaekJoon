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
			int sum = 0;
			int Array[] = new int[a];
			boolean d = true;
			
			
			for(int i = 0; i<a; i++) {
				if(a % (i+1) == 0 ) {
					Array[count] = i+1;
					count++;
				}
			}
			
			for(int i = 0; i<count-1; i++) {
				sum += Array[i];
			}
			
			if(sum == a) {
				d = true;
			}
			else {
				d = false;
			}
			
			if(!d) {
				System.out.println(a + " is NOT perfect.");
			}
			else {
				System.out.print(a + " = ");
				for(int i = 0; i < count-2; i++) {
					System.out.print(Array[i] + " + ");
				}
				System.out.println(Array[count-2]);
				
			}
			
			
			
			
		}
		
	}

}
