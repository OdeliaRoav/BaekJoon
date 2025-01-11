package D0110;

import java.util.Scanner;

public class B18198 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // 경기 기록 입력
        sc.close(); // Scanner 닫기

        int acount = 0, bcount = 0; // 앨리스와 바바라의 점수 초기화

        for (int i = 0; i < input.length(); i += 2) {
            char player = input.charAt(i); // 'A' 또는 'B'
            int score = Character.getNumericValue(input.charAt(i + 1)); // '1' 또는 '2'

            // 점수 누적
            if (player == 'A') {
                acount += score;
            } else if (player == 'B') {
                bcount += score;
            }

            // 승리 조건 확인
            if ((acount >= 11 || bcount >= 11) && Math.abs(acount - bcount) >= 2) {
                System.out.println(acount > bcount ? "A" : "B");
                return; // 게임 종료
            }

            // "2점 선취" 규칙
            if (acount >= 10 && bcount >= 10 && Math.abs(acount - bcount) >= 2) {
                System.out.println(acount > bcount ? "A" : "B");
                return; // 게임 종료
            }
        }
    }
}
