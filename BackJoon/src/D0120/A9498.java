package D0120;

import java.util.Scanner;

public class A9498 {
	
	public static char print(int a) {
		char b = 0;
		
		if(a>=90 && a<=100) {
			b = 'A';
		}
		else if(a>=80 && a<90) {
			b = 'B';
		}
		else if(a>=70 && a<80) {
			b = 'C';
		}
		else if(a>=60 && a<70) {
			b = 'D';
		}
		else {
			b = 'F';
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println(print(a));
		
	}

}
