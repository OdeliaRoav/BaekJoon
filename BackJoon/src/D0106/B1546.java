package D0106;

import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int Array[] = new int[N]; 
		
		for(int i = 0; i < N; i++) {
			Array[i] = sc.nextInt();
			
		}
		
		int temp = Array[0];
		
		for(int i = 0 ; i < N; i++) {
			if(temp<Array[i]) {
				temp = Array[i];
			}
			
		}
	
		double avg = 0;
		double sum = 0;
		for(int i = 0; i < N; i++) {
			sum = ((double)Array[i]/temp)*100;
			avg = avg + sum;
		
		
		}
		

		System.out.print(avg/N);
			
	}

}