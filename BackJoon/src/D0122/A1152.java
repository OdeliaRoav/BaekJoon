package D0122;

import java.util.Scanner;

public class A1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine().trim();
		
		if(a.isEmpty()) {
			System.out.println('0');
		}
		else {
			System.out.println(a.split(" ").length);
		}
		
	}

}

//a.split(" ").length 하면 특정 단어를 기준으로 길이를 잰다.
