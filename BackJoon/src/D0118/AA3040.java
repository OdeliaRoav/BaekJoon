package D0118;

import java.util.Scanner;

public class AA3040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Array[] = new int[9];
		int total = 0;
		
		for (int i = 0; i<9; i++) {
			Array[i] = sc.nextInt();
			total += Array[i]; //입력한 9개의 숫자 전부 더하기
			
		}
		
		for(int i = 0; i<8; i++) {
			for(int j = i+1; j<9; j++) {
				if(total - Array[i] - Array[j] == 100) {
					for(int k = 0; k<9; k++) {
						if(k != i && k!= j) {
							System.out.println(Array[k]);
						}
					}
				}
			}
		}
		
		
		
	}

}
