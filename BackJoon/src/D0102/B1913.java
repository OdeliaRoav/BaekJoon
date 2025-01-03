package D0102;
import java.util.Scanner;

public class B1913 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배열 크기
        int K = sc.nextInt(); // 찾고자 하는 숫자

        int[][] snail = new int[N][N]; // 달팽이 배열 생성
        int x = N / 2, y = N / 2; // 중앙에서 시작
        int num = 1; // 채울 숫자 시작
        int step = 1; // 이동 거리
        int targetX = 0, targetY = 0; // K의 위치 저장

        // 달팽이 배열 채우기
        while (num <= N * N) {
            // 상 (위로)
            for (int i = 0; i < step && num <= N * N; i++) {
                snail[x--][y] = num++;
            }

            // 우 (오른쪽으로)
            for (int i = 0; i < step && num <= N * N; i++) {
                snail[x][y++] = num++;
            }

            step++; // 이동 거리 증가

            // 하 (아래로)
            for (int i = 0; i < step && num <= N * N; i++) {
                snail[x++][y] = num++;
            }

            // 좌 (왼쪽으로)
            for (int i = 0; i < step && num <= N * N; i++) {
                snail[x][y--] = num++;
            }

            step++; // 이동 거리 증가
        }

        // 배열에서 K의 위치 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (snail[i][j] == K) {
                    targetX = i + 1; // 1-based index
                    targetY = j + 1; // 1-based index
                }
            }
        }

        // 배열 출력
        for (int[] row : snail) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        // K의 위치 출력
        System.out.println(targetX + " " + targetY);
    }
}
