package D0106;

import java.util.Scanner;

public class BH5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int[30];
		
		for(int i = 0; i < 28; i++) {
			int st = sc.nextInt();
			Array[st-1] = 1;
		}
		
		for(int i = 0; i<30; i++) {
			if(Array[i] == 0) {
				System.out.println(i+1); //i+1하는 이유가 sc로 입력 받은 값을 제외하고 0이기 때문에 그 위치가 i+1임
			}
		}
		
	}

}
