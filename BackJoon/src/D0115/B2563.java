package D0115;

import java.util.Scanner;

public class B2563 {
    public static void main(String[] args) {
        int arr[][] = new int [100][100]; // 도화지 배열

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){ // 도화지 배열에 색종이 삽입

            int row = sc.nextInt();
            int col = sc.nextInt();

            for (int w = row; w < row + 10; w++){ // 색종이의 너비. 3에서 시작하는 종이라면 3부터 13까지 돌아감 (너비가 10)
                for (int h = col; h < col + 10; h++){ // 색종이의 길이. 5에서 시작하는 종이라면 5부터 15까지 돌아감 (길이도 10)
                    arr[w][h] = 1;
                }

            }
        }

        int area = 0;
        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 100; j++){
                if (arr[i][j] == 1){
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}