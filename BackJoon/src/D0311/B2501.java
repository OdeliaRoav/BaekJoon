package D0311;

import java.util.Scanner;

public class B2501 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		int Array[] = new int[a];
		
		for(int i = 0; i<a; i++) {
			if(a % (i+1) == 0) {
				Array[count] = (i+1);
				count ++;
			}
		}
		
		if(count<b) {
				System.out.println("0");
			}
		else {
				System.out.println(Array[b-1]);
			}
		
		
	}

}
