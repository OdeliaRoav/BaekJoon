package D0218;

import java.util.Scanner;

public class A18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int[] Array = new int[a];
        int[] Array2 = new int[a]; // 좌표 압축 결과 저장

        // 입력 받기
        for (int i = 0; i < a; i++) {
            Array[i] = sc.nextInt();
        }

        // 좌표 압축 (O(N²) 방식)
        for (int i = 0; i < a; i++) {
            int count = 0; // 현재 숫자가 몇 번째 작은지 계산
            for (int j = 0; j < a; j++) {
                if (Array[j] < Array[i]) {
                    count++; // 나보다 작은 값 개수 세기
                }
            }
            Array2[i] = count; // 결과 저장
        }

        // 결과 출력
        for (int i = 0; i < a; i++) {
            System.out.print(Array2[i] + " ");
        }
        
        sc.close();
    }
}
