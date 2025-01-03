package D1230;
import java.util.Scanner;

public class B2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int root = 1;
		int range = 2;
		
		if(a == root) {
			System.out.println(1);
		}
		else {
			while(range<=a) {
				range = range+(6 * root);
				root++;
			}
			
			System.out.println(root);
		}
	}

}
