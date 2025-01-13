package D0113;

import java.util.Scanner;

public class B10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		char[] abc=new char[26];
		int Array[] = new int[26];
		
		for(int i=0; i<abc.length; i++) {
			abc[i]=(char)(i+97);
		}
		for(int i = 0 ; i<Array.length; i++) {
			Array[i] = -1;
		}
		
		for(int i = 0; i<a.length(); i++) {
			for(int j = 0; j<abc.length; j++) {
				if(a.charAt(i) == abc[j]) {
					if(Array[j] == -1) {
					Array[j] = i;
					}
				}
				
			}
		}
		
		
		
		for(int i=0; i<abc.length; i++) {
			System.out.print(Array[i]+" ");
		}
		
	}

}

/*
*/