package D0107;

import java.util.Scanner;

public class B17466 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long p = scanner.nextLong();

        long num=1;

        for(int i=2;i<n+1;i++){
            num=(num*i)%p;
        }

        System.out.println(num%p);
    }
}