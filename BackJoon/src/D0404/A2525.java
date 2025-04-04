package D0404;

import java.util.Scanner;

public class A2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//전부 분으로 만들어서 합친 뒤 나누기
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		int total = a*60 + b;
		b = b + c;
		
		int hour = (b / 60) % 24;
	    int minute = b % 60;
		
	    System.out.print(hour + " " + minute);
		
	}

}
