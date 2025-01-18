package D0118;

import java.util.Scanner;

public class Self3040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int[9];
		int sum = 0;
		
		for(int i = 0; i<Array.length; i++) {
			Array[i] = sc.nextInt();
			sum += Array[i]; // 전체를 더하고 
		}
		
		for(int i = 0; i<9; i++) {
			for(int j = i+1; j<9; j++) { // i+1인 이유가 유일한 숫자를 입력하기 때문에 a 다음 b로 검사하는 구조
				if(sum - Array[i] - Array[j] == 100) { // 전체에서 아닌 값을 찾아 뺀다.
					for(int c = 0; c<9; c++) {
						if(c != i && c != j) {
							System.out.println(Array[c]);
						}
					}
				}
			}
		}
		
		
	}

}
