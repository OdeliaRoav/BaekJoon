package j4p42;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-Simon";
		
		String names[] = text.split("&|,|-");
		for(String name : names) {
			System.out.println(name);
		}
		
		String text2 = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
	}

}
