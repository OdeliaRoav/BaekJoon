package D0110;

import java.util.Scanner;

public class B32978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String Array[] = new String[N];
		String BB[] = new String[N-1];
		
		String a = " ";
		
		
		for(int i = 0; i< N; i++) {
			Array[i] = sc.next();
		}
		
		for(int i = 0; i < N-1; i++) {
			BB[i] = sc.next();
		}
		
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N-1; j++) {
				if(Array[i].equals(BB[j])) {
					Array[i] = "0";
				}
			}
		}
		//배열에서 없는 내용 찾을 때 있는 애들을 0으로 치환해버리고 !~~.equals() 사용해서 풀기
		for(int i = 0; i < N; i++) {
			if(!Array[i].equals("0")) {
				System.out.println(Array[i]);
			}
		}
		
		System.out.println();
	}

}
