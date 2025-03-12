package D0312;

import java.util.Scanner;

public class B1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = 0;
		
		for(int i = 2; i< a; i++) {
			int n = sc.nextInt();
			for(n = 2; n<i; n++) {
				if(i%n == 0) {
					break;
				}
			}
			if(i == n) {
				count++;
			}
			
		}
		
		
		System.out.print(count+1);
		
	}

}
