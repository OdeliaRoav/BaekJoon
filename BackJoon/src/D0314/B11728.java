package D0314;

import java.io.*;
import java.util.StringTokenizer;

public class B11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 

        // 첫 줄에서 a, b 값 읽기
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] Array = new int[a];
        int[] Array2 = new int[b];

        // 첫 번째 배열 입력
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < a; i++) {
            Array[i] = Integer.parseInt(st.nextToken());
        }

        // 두 번째 배열 입력
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < b; i++) {
            Array2[i] = Integer.parseInt(st.nextToken());
        }

        // 병합 정렬 방식으로 두 배열 합치기
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < a && j < b) {
            if (Array[i] < Array2[j]) {
                sb.append(Array[i++]).append(" ");
            } else {
                sb.append(Array2[j++]).append(" ");
            }
        }

        // 남아 있는 요소 추가
        while (i < a) {
            sb.append(Array[i++]).append(" ");
        }
        while (j < b) {
            sb.append(Array2[j++]).append(" ");
        }

        // 결과 출력
        bw.write(sb.toString().trim()); // 마지막 공백 제거 후 출력
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
