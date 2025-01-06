package D0106;

import java.util.Scanner;

public class B3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Array = new int[10];
        int count = 0;

        // 입력받은 수를 42로 나눈 나머지를 배열에 저장
        for (int i = 0; i < 10; i++) {
            Array[i] = sc.nextInt() % 42;
        }

        // 중복 확인
        for (int i = 0; i < 10; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (Array[i] == Array[j]) {
                    isUnique = false; // 이전에 같은 값이 있으면 중복으로 간주
                    break;
                }
            }
            if (isUnique) {
                count++; // 중복이 아니면 카운트 증가
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
