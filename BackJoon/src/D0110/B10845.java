package D0110;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B10845 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int last = -1; // 마지막으로 추가된 값을 저장할 변수
        
        int a = sc.nextInt();
        
        for (int i = 0; i < a; i++) {
            String b = sc.next();
            
            if (b.equals("push")) {
                int c = sc.nextInt();
                q.add(c);
                last = c; // 마지막으로 추가된 값을 업데이트
            } else if (b.equals("pop")) {
                if (q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(q.poll());
                }
            } else if (b.equals("size")) {
                System.out.println(q.size());
            } else if (b.equals("empty")) {
                if (q.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (b.equals("front")) {
                if (q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(q.peek());
                }
            } else if (b.equals("back")) {
                if (q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(last); // 마지막 값을 출력
                }
            }
        }
        sc.close();
    }
}
