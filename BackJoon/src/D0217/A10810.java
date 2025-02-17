package D0217;

import java.util.Scanner;

public class A10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int N = sc.nextInt();
		int M = sc.nextInt();
	
		int Array[] = new int[N];
			
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			for(int j = a-1; j<b; j++ ) {
				Array[j]=c;
			}
			
		}
		
		for(int i = 0; i<N; i++) {
			System.out.print(Array[i] + " ");
		
		}
	}

}
