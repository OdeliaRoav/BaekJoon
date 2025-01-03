package D1231;
import java.util.*;


class B9012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        Stack<Integer> stack = new Stack<>();
        boolean ans; // VPS인지 아닌지를 가르쳐 준다.
        
        String str;
        
        for (int i=0; i<T; i++) {
            stack.clear();
            ans = true; // ans를 처음에는 true로 설정.
            
            str = scan.nextLine();
            for (int j=0; j<str.length(); j++) {
                if (str.charAt(j) == '(') { // '('이라면
                    stack.push((int)str.charAt(j)); // 스택에 넣는다.
                } else { // ')'이라면
                    if (stack.empty()) { // 스택에 비어있다면
                        ans = false; // VPS가 아님. (짝이 안 맞으므로)
                        break;
                    } else { // 스택에 '('가 있을 경우
                        stack.pop();
                    }
                }
            }
            
            if (!stack.empty()) { // 한 줄을 다 돌았는데 스택에 '('가 남아 있다면?
                ans = false; // VPS가 아님.
            }
            System.out.println(ans ? "YES" : "NO");
        }
	}
        
}


