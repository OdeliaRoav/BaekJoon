package D0110;

import java.util.Scanner;

public class B23803 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		//1을 넣으면 한줄로 5칸씩
		//3을 넣으면 3줄로 5칸씩
		
		for(int i = 1; i<=a*5-a; i++) {
			for(int j = 1; j<=a; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for(int i = 1; i<=a; i++) {
			for(int j = 1; j<=a*5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
