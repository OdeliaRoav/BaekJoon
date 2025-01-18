package D0118;

import java.util.Scanner;

public class A2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = b%10*a;
		int d = ((b%100-(b%10))/10)*a;
		int e = ((b%1000-(b%100))/100)*a;
		
		int f = c + d*10 + e*100;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println(f);
				
				
	}

}
