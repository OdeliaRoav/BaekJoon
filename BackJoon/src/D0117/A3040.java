package D0117;

import java.util.Scanner;

public class A3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];
        int total = 0;

        // 키 입력 및 합계 계산
        for (int i = 0; i < 9; i++) {
            heights[i] = sc.nextInt();
            total += heights[i];
        }

        // 두 난쟁이 찾기 및 출력
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - heights[i] - heights[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(heights[k]);
                        }
                    }
                    return; // 프로그램 종료
                }
            }
        }
    }
}
