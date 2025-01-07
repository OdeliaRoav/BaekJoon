package D0107;

import java.util.Scanner;
import java.util.Stack;

//문자열 비교는 ==가 아니라 equals로 해야함 ==는 숫자들 비교할 때 사용;

public class B10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> Stack = new Stack<>();
		
		int a = sc.nextInt();
		
		for(int i = 0; i<a; i++) {
			String b = sc.next();
			if(b.equals("push")) {
				int c = sc.nextInt();
				Stack.push(c);
			}
			else if (b.equals("pop")) {
				
				if(Stack.empty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(Stack.pop());
				}
			}
			else if (b.equals("size")) {
				System.out.println(Stack.size());
			}
			else if (b.equals("empty")) {
				if(Stack.empty() == true) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else if (b.equals("top")) {
				if(Stack.empty() == true) {
					System.out.println(-1);
				}
				else {
					System.out.println(Stack.peek());
				}
				
			}

		}
		
	}
}
