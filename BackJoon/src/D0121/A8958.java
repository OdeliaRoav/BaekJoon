package D0121;

import java.util.Scanner;

public class A8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		for(int i = 0; i<a; i++) {
			String b = sc.next();
			int count = 0;
			int sum = 0;
			
			for(int j = 0; j<b.length(); j++) {
				if(b.charAt(j)== 'O') {
					count++;
					sum += count;
				}
				else if(b.charAt(j) == 'X') {
					count = 0;
				}
				
			}
			System.out.println(sum);
		}
		
		
	}

}
