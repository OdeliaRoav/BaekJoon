package D0108;

import java.util.Scanner;

public class B15881 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = 0;
		int num = 0;
	
		
		char Array[] = new char[a];
		String b = sc.next();
		
		
		for(int i = 0; i <= a; i++) {
			Array[i] = b.charAt(i);
		}
		
		
		while (num <= a-4) { // 패턴 길이만큼의 범위를 고려
		    if(Array[num]== 'p' && Array[num+1] == 'P' && Array[num+2] == 'A' && Array[num+3] == 'p') {
		    	count++;
		    	num +=4;
		    }
		    num++;
		}

		
		System.out.print(count);
		
		
	}

}


/*if(b.charAt(i) == 'p') {
if(b.charAt(i) == 'P') {
if(b.charAt(i) == 'A') {
	if(b.charAt(i) == 'p') {
		count++;
	}
}
}
}



for(int i = 0; i < a; i++) {
			System.out.print(Array[i] + " ");
		}
		
*/