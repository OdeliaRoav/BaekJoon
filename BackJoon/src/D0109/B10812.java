package D0109;

import java.util.Scanner;
import java.util.Calendar;


public class B10812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //N은 바구니 수
		int M = sc.nextInt(); //M은 몇 번 바꿀 것 인지
		
		int Array[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			Array[i] = i+1;
		}
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt(); //a부터 b까지의 범위
			int b = sc.nextInt(); //c가 중심점 그럼 총 몇개인가 b-a+1개의 범위를 갖는다.
			int c = sc.nextInt();
		
			int temp = Array[c];
			
			for(int j = c; j<=b; j++) {
				Array[a] = Array[i];
				
				
			}
			
			
		}
		
		
		for(int i = 0; i< N; i++) {
			System.out.print(Array[i] + " ");
		}
			
		
	}

}


/*
for(int i = 0; i< M; i++) {
			System.out.print(Array[i] + " ");
		}
		
*/