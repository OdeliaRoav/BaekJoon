package D1231;
import java.util.Scanner;

public class B2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1; i<=a; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
