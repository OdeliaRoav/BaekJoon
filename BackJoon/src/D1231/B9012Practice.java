package D1231;
import java.util.Scanner;
import java.util.Stack;

public class B9012Practice {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<>();
		
		int a = sc.nextInt();
		String Array[] = new String[a];
		
		boolean ans;
		
		
		for(int i = 0; i < a; i++) {
			stack.clear();
			ans = true;
			String str = sc.next();
			
			for (int j=0; j<str.length(); j++) {
                if (str.charAt(j) == '(') { 
                    stack.push((int)str.charAt(j)); 
                } else { 
                    if (stack.empty()) { 
                        ans = false;
                        break;
                    } else { 
                        stack.pop();
                    }
                }
            }
			if(!stack.empty()) {
				ans = false;
			}
			
			if(ans == true) {
				Array[i] = "YES";
			}
			else if(ans == false ){
				Array[i] = "NO";
			}
			
				
		}
		for(int i = 0; i < a; i++) {
			System.out.println(Array[i]);
		}
		
	}

}
