package D0109;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class B28278 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Stack<Integer> Stack = new Stack<>();
		
		int a = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i<a; i++) {
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			
			switch(b) {
				case 1:
					int c = Integer.parseInt(st.nextToken());
					Stack.push(c);
					break;
				case 2:
					if(Stack.empty()) {
						System.out.println(-1);
					}
					else {
						System.out.println(Stack.pop());
					}
					break;
				case 3:
					System.out.println(Stack.size());
					break;
				case 4:
					if(Stack.empty()) {
						System.out.println(1);
					}
					else {
						System.out.println(0);
					}
					break;
				case 5:
					if(Stack.empty()) {
						System.out.println(-1);
					}
					else {
						System.out.println(Stack.peek());
					}
					break;
			}
				
			
			
		}
		
		
		
	}

}
