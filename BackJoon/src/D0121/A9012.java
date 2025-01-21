package D0121;

import java.util.Scanner;
import java.util.Stack;

public class A9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		
		for(int i = 0; i<a; i++) {
			String s = sc.next();
			Stack<Character>stack = new Stack<>(); // 계속 초기화하는 작업
			
			for(int j = 0; j<s.length(); j++) {
				if(s.charAt(j)=='(') {
					stack.push('(');
				}
				else if (stack.isEmpty()){
					stack.push(')');
					break;
				}
				else {
					stack.pop();
				}
				
			}
			if(stack.isEmpty()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
		
		
	}

}
