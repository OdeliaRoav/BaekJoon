import java.util.Scanner;

public class B2441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int c = a-1; c>=i; c-- ) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	
	
	}

}
