package D0109;

import java.util.Scanner;

public class B1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N번째 종말의 수 입력
        
        int count = 0; // 종말의 수 개수
        int number = 666; // 첫 번째 종말의 수 시작

        while (true) {
            if (String.valueOf(number).contains("666")) {
                count++;
            }

            if (count == N) {
                System.out.println(number);
                break;
            }

            number++;
        }
    }
}
