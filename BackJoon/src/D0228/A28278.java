package D0228;

import java.util.Scanner;
import java.util.Stack;

public class A28278 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<>();
		
		int a = sc.nextInt();
		
		for(int i = 0; i<a; i++) {
			int b = sc.nextInt();
			if(b == 1) {
				int c = sc.nextInt();
				stack.push(c);
			}
			else if (b == 2) {
				if(stack.isEmpty()) {
					System.out.print("-1");
				}
				else {
					System.out.println(stack.pop());
				}
			}
			else if (b == 3) {
				System.out.println(stack.size());
			}
			else if (b == 4) {
				if(stack.empty()) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else if (b == 5) {
				if(stack.empty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(stack.peek());
				}
			}
			
			
		}
		
		
		
	}

}
