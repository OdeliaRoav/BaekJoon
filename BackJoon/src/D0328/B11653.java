package D0328;

import java.util.ArrayList;
import java.util.Scanner;

public class B11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> List = new ArrayList<>();
		
	
		int n = sc.nextInt();
		
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				n/= i;
			}
			List.add(i);
		}
		for(int i = 0; i<List.size(); i++) {
			System.out.println(List.get(i));
		}
		
		
		
	}

}
