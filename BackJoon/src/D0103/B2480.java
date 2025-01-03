package D0103;
import java.util.Scanner;

public class B2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b && b==c) {
			System.out.print(10000 + a*1000);
		}
		else if (a==b || b==c || a==c) {
			if(a==b) {
				System.out.print(1000 + a*100);
			}
			else if (b==c) {
				System.out.print(1000 + b*100);
			}
			else if (a==c) {
				System.out.print(1000 + a*100);
			}
		}
		
		else {
			if(a>b) {
				if(a>c) {
					System.out.print(a * 100);
				}
				else {
					System.out.print(c * 100);
				}
			}
			else if (b>a) {
				if(b>c) {
					System.out.print(b * 100);
				}
				else {
					System.out.print(c * 100);
				}
			}
			else if (c>a) {
				if(c>b) {
					System.out.print(c * 100);
				}
				else {
					System.out.print(a * 100);
				}
				
			}
		}
		
		
		
	}

}
