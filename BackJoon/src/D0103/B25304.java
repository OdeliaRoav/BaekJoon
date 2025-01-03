package D0103;

import java.util.Scanner;

public class B25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int sum = 0; 
		
		int num = sc.nextInt();
		
		
		
		for(int i = 0; i<num; i++) {
			int item = sc.nextInt();
			int count = sc.nextInt();
			sum = sum + (item*count);

		}
		if(sum == total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
	}

}
