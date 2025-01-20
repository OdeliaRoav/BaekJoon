package D0120;

import java.util.Scanner;
import java.util.Stack;

public class A9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int a = sc.nextInt();
		
		for(int i = 0; i<a; i++) {
			String str = sc.next();
			Stack<Character> stack = new Stack<>();
			
			for(int j = 0; j<str.length(); j++) {
				if(str.charAt(j) == '(') {
					stack.push('(');
				}
				else {
					if(stack.isEmpty()) {
						stack.push(')');
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			
			//stack.empty()는 스택 초기화
			//stack.isEmpty()는 스택이 비어있는지를 확인한다.
			if(stack.isEmpty()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
		

	}

}
