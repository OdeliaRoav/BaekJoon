package D0220;

import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int cnt[] = new int[26];
		a = a.toUpperCase();
		
		for(int i = 0; i<a.length(); i++) {
			cnt[a.charAt(i) - 'A']++;
		}
		for(int i = 0; i< cnt.length; i++) {
			System.out.printf("c : %d\n", (char)('A'+i), cnt[i]);
		}
		
		int max = -1;
		int maxCh = -1;
		for(int i = 0; i< cnt.length; i++) {
			if(cnt[i]>max) {
				max = cnt[i];
				maxCh = i;
			}
		}
		System.out.println(max);
		
		int maxcnt = 0;
		for(int i = 0; i< cnt.length; i++) {
			if(cnt[i]== max) {
				maxcnt++;
			}
		}
		
		if(maxcnt>1) {
			System.out.println("?");
		}
		else {
			System.out.printf("%c\n", (char)('A'+maxCh));
		}
		
	}

}
/*
package q564;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26]; // 알파벳 개수 저장 배열

        while (true) { //hasNext()는 boolean으로 True or False를 리턴함 그래서 그냥 sc.hasNext()하면 True 반환(False 값 나오기 전까지)
            char ch = sc.next().charAt(0); // 한 글자 입력받기
            if (ch < 'A' || ch > 'Z') break; // 대문자가 아니면 입력 종료
            count[ch - 'A']++; // 해당 문자 카운트 증가
        }

        sc.close();

        
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) { // 1번 이상 등장한 문자만 출력
                System.out.println((char) (i + 'A') + " : " + count[i]);
            }
        }
    }
}
*/