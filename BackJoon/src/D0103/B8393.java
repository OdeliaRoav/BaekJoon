package D0103;

import java.util.Scanner;

public class B8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=a; i++) {
			sum = sum + i;
		}
		
		System.out.print(sum);
	}

}
