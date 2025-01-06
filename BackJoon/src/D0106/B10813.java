package D0106;

import java.util.Scanner;

public class B10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int Array[] = new int[N];
		
		
		for(int i = 0; i < N; i++) {
			Array[i] = i+1;
		}
		
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int c = Array[a-1];
			Array[a-1] = Array[b-1];
			Array[b-1] = c;
			
			
			
		}
				
		
		
		for(int i = 0; i < N; i++) {
			System.out.print(Array[i] + " ");
		}
		
	}

}
