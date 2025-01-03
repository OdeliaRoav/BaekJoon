package D0103;

import java.util.Scanner;

public class B10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp = 0;
		int temp2 = 0;
		
		int a = sc.nextInt();
		int Array[] = new int[a];
		int Array2[] = new int[a];
		for(int i = 0; i < a; i++) {
			Array[i] = sc.nextInt();
		}
		
		temp = Array[0];
		temp2 = Array[0];
		for(int i = 0; i < a; i++) {
			
			if(temp>Array[i]) {
				temp = Array[i];
			}
			
			if(temp2<Array[i]) {
				temp2 = Array[i];
			}
		}
	
		System.out.print(temp);
		System.out.print(" " + temp2);
		
	}

}
