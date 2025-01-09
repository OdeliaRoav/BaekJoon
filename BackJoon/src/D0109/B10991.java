package D0109;
import java.util.Scanner;

public class B10991 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<a-i-1; j++) {
				System.out.print(" ");
			}
			for(int c = 0; c<i+1; c++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
	
	
	}

}
