package D0114;

import java.util.Scanner;

public class B11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		System.out.println(Integer.toString(a,b).toUpperCase());
	}

}

//System.out.println(Integer.toString(a,3)); 10진수 -> N진수 (3이 N임)
//System.out.println(Integer.parseInt(a,3)); N진수 -> 10진수 (역시 3이 N이다.)