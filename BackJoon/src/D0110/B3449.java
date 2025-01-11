package D0110;

import java.util.Scanner;

public class B3449 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i<a; i++) {
			int distance = 0;
			String b = sc.next();
			String c = sc.next();
			for(int j = 0; j<b.length(); j++) {
				if(b.charAt(j)!=c.charAt(j)) {
					distance ++;
				}
			}
			System.out.println("Hamming distance is " + distance + '.');
		}


	}
}

/*if(b.charAt(i)!= c.charAt(i)) {
				distance ++;
			}
			System.out.println("Hamming distance is " + distance + '.');
		}*/
