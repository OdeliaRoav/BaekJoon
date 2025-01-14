package D0114;

import java.util.Scanner;

public class B2444 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        for (int i = 1; i <= a; i++) {
            // 공백 출력
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int c = 1; c <= 2 * i - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = 1; i<a; i++) {
        	for(int j = 1; j<=i; j++) {
        		System.out.print(" ");
        	}
        	for(int c = 1; c<=2*(a-i)-1; c++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        sc.close();
    }
}
