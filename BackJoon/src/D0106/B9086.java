package D0106;

import java.util.Scanner;

public class B9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			String b = sc.next();
			System.out.print(b.charAt(0));
			System.out.println(b.charAt(i));
		}
		
		
		
	}

}
