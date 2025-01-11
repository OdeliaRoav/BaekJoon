package D0110;

import java.util.*;
import java.io.*;

public class B32943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken()); // 학생 수
        int C = Integer.parseInt(st.nextToken()); // 좌석 수
        int K = Integer.parseInt(st.nextToken()); // 로그 수

        // 로그 데이터를 저장할 리스트
        List<int[]> logs = new ArrayList<>();

        // 로그 입력 받기
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken()); // 시간
            int S = Integer.parseInt(st.nextToken()); // 좌석 번호
            int N = Integer.parseInt(st.nextToken()); // 학번
            logs.add(new int[]{T, S, N});
        }

        // 시간 순으로 로그 정렬
        logs.sort(Comparator.comparingInt(log -> log[0]));

        // 상태를 관리하기 위한 배열
        int[] seatAssigned = new int[C + 1]; // 좌석 상태 (해당 좌석에 배정된 학생 번호, 0: 비어 있음)
        int[] studentSeat = new int[X + 1]; // 학생별 배정받은 좌석 번호 (0: 비어 있음)

        // 로그 처리
        for (int[] log : logs) {
            int seat = log[1];   // 좌석 번호
            int student = log[2]; // 학번

            // 만약 이 학생이 이미 다른 좌석에 배정받아 있다면 기존 좌석을 해제
            if (studentSeat[student] != 0) {
                int previousSeat = studentSeat[student]; // 이전 좌석
                seatAssigned[previousSeat] = 0; // 기존 좌석 비우기
            }

            // 새로운 좌석에 배정
            seatAssigned[seat] = student;
            studentSeat[student] = seat; // 학생의 좌석 정보 업데이트
        }

        // 최종 상태에서 좌석을 점유한 학생들만 수집
        List<int[]> results = new ArrayList<>();
        for (int i = 1; i <= X; i++) {
            if (studentSeat[i] != 0) { // 좌석에 학생이 배정된 경우만 추가
                results.add(new int[]{i, studentSeat[i]}); // {학번, 좌석 번호}
            }
        }

        // 학번 기준으로 정렬
        results.sort(Comparator.comparingInt(result -> result[0]));

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int[] result : results) {
            sb.append(result[0]).append(" ").append(result[1]).append("\n");
        }

        // 최종 출력
        System.out.print(sb.toString().trim()); // 마지막에 줄바꿈 제거
    }
}
