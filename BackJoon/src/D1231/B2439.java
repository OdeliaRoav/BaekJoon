package D1231;
import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			for(int j = a; j>i; j--) {
				System.out.print(" ");
			}
			for(int c = 1; c<=i; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
