package D0411;

import java.util.Scanner;

public class B1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;

		for(int i = 0; i < n; i++) {
			String word = sc.next();
			boolean[] check = new boolean[26];
			boolean isGroup = true;

			for(int j = 0; j < word.length(); j++) {
				char now = word.charAt(j);

				if(j > 0 && word.charAt(j) != word.charAt(j - 1)) {
					if(check[now - 'a']) {
						isGroup = false;
						break;
					}
				}

				
				check[now - 'a'] = true;
			}

			if(isGroup) count++;
		}

		System.out.println(count);
	}
}
