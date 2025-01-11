package Book;

import java.util.Scanner;

public class Math {
	static int max(int a[]) {
		int temp = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(temp<a[i]) {
				temp = a[i];
			}
		}
		return temp;	
	}
	
	static int min(int a[]) {
		int temp =a[0];
		
		for(int i = 0; i< a.length; i++) {
			if(temp>a[i]) {
				temp = a[i];
			}
		}
		
		return temp;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Math math1 = new Math();
		
		int Array[] = new int[5];
		
		for(int i = 0; i<5; i++) {
			Array[i] = sc.nextInt();
		}
		

		System.out.println(math1.max(Array));
		System.out.print(math1.min(Array));
	}

}
