package D0109;

import java.util.Scanner;

public class BH1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		int number = 0;
		
		while(true) {
			if(String.valueOf(number).contains("666")) {
				count++;
			}
			if(count == N) {
				System.out.println(number);
				break;
			}
			
			number++;
		}
		
		
	}

}
