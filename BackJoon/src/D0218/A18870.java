package D0218;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A18870 {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        
        int a = Integer.parseInt(bf.readLine());
        int[] Array = new int[a];
        int[] Array2 = new int[a]; // 좌표 압축 결과 저장

        // 입력 받기
        for (int i = 0; i < a; i++) {
            Array[i] = Integer.parseInt(bf.readLine());
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
        	bw.write(Array2[i]+ " ");
        }
        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();
    }
}
