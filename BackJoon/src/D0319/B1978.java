package D0319;

import java.util.Scanner;

public class B1978 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num;
        int count = 0;
        for(int i=0; i<N; i++){ // N까지 num을 대입 받고 반복한다.
            num = sc.nextInt(); // num을 받는다.
            for(int j=2; j<=num; j++){// 2부터 num까지 나눈다.
                if(j==num) { // 만약 j하고 num이 같으면 자기 자신까지 온 거니까 count++ 한다.
                    count++; // j가 num하고 같지 않으면 밑으로 내려간다.
                }
                if(num%j==0){// 만약 num을 j나눈 나머지가 0이되면 빠져 나온다.
                    break;
                }
            }
        }
        System.out.println(count);
    }
}