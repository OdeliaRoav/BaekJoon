package D0106;

import java.util.Scanner;

public class B10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int Array[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			Array[i] = i+1;
			
		}
		
		
		for(int i = 0; i<M; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			while(a<b) {
				int temp = Array[a];
				Array[a] = Array[b];
				Array[b] = temp;
				
				a++;
				b--;
			}
			
		
		}
		
		for(int i = 0; i<N; i++) {
			System.out.print(Array[i] + " ");
		}
	}

}
