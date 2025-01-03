package D0103;

import java.util.Scanner;

public class B11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 1; i<=count; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int sum = a+b;
			
			System.out.println("Case #"+ i + ": " + sum);
			
		}
		
		
	}

}
