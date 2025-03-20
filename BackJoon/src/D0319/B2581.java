package D0319;

import java.util.Scanner;

public class B2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int sum = 0;
		
		for(int i = a; i<=b; i++) {
			if(a%i == 0) {
				sum = sum+i;
			}
        	  if(a%i==0){
                    break;
                }
        	  }
		}
		
		
		
	}


