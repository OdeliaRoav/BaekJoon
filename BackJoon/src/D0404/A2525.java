package D0404;

import java.util.Scanner;

public class A2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		int time = sc.nextInt();
		
		int sum = min + time;
		
		if(sum>=60) {
			sum = sum - 60;
			hour = hour + 1;
			
			if(hour>=24) {
				hour = 0;
			}
		}
		
		if(sum == 60) {
			sum = 0;
			hour = hour + 1;
		}
		
		System.out.print(hour + " " + sum);
		
	}

}
