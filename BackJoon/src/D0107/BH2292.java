package D0107;

import java.util.Scanner;

public class BH2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int root = 1;
		int range = 2;
		
		if(a == root) {
			System.out.print(root);
		}
		else {
			while(range<a) {
				range = range + (root * 6);
				root++;
			}
			System.out.print(root);
		}
		
		
	}

}
