package D0328;

import java.util.ArrayList;
import java.util.Scanner;

public class B11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 2; i<=n; i++) {
			while(n % i == 0) {
				System.out.println(i);
				n /=i;
			}
			
		}
	}


}
