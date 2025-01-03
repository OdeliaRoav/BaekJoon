package D0103;

import java.util.Scanner;

public class B25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a%4==0) {
			int count = a/4;
			
			for(int i = 1; i<=count; i++) {
				System.out.print("long ");
			}
			System.out.print("int");
		}
		else {
			System.out.print("Error");
		}
		
		
		
		
	}

}
