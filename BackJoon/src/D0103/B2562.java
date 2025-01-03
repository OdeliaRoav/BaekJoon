package D0103;

import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int[9];
		int temp = 0;
		int count = 0;
		
		
		for(int i = 0; i<9; i++) {
			Array[i] = sc.nextInt();
		}
		
		temp = Array[0];
		for(int i = 0; i < 9; i++) {
			if(temp<Array[i]) {
				temp = Array[i];
			}
		}
		
		for(int i = 0; i<9; i++) {
			count++;
			if(temp ==Array[i]) {
				break;
			}
		}
		
		System.out.println(temp);
		System.out.println(count);
		
	}

}
