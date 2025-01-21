package D0121;

import java.util.Scanner;

public class A3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int[10];
		
		for(int i = 0; i<Array.length; i++) {
			int a = sc.nextInt();
			Array[i] = a%42;
		}
		
		int b = Array[0];
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (Array[i] == Array[j]) {
                    isUnique = false; 
                    break;
                }
            }
            if (isUnique) {
                count++; // 중복이 아니면 카운트 증가
            }
        }

		System.out.println(count);
		
		
	}

}
