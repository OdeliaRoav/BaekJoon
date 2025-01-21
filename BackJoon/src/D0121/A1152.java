package D0121;

import java.util.Scanner;

public class A1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().trim(); // 앞, 뒤 공백 제거 문자열 리턴
		// 공백을 기준으로 카운팅하기 때문에 trim으로 공백 제거한다.
		if(str.isEmpty()) {
			System.out.println('0');
		}
		else {
			System.out.println(str.split(" ").length);
			}
		
		
		
	}

}
