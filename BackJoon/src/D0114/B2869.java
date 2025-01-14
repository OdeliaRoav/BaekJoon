package D0114;

import java.util.Scanner;

public class B2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int count = 0;
		int num = 0;
		
		while(count <= c) {
			
			count += a;
			num++;
			count -= b;
		
			
			
		}
		System.out.print(num);
		
		
		
	}

}
