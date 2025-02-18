package D0218;

import java.util.Scanner;
import java.util.Arrays;

public class A18870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int Array[] = new int[a];
		int Array2[] = new int[a];
		
		//중복 시 생략은 안하는 듯.
		
		for(int i = 0; i<a; i++) {
			 
			Array[i]= sc.nextInt();
			
		}
		
		Arrays.sort(Array); //Array 배열 정렬
			
		for(int i = 0; i<a; i++) {
			int count = 0;
			int b = Array[i];
			
			for(int j = 0; j < a; j++) {
				if(b > Array[j]) {
					count++;
				}
				
			}
			Array2[i] = count;
			
		}
		
		for(int i = 0; i<a; i++) {
			System.out.print(Array2[i] + " ");
		}
		
		
	}

}
