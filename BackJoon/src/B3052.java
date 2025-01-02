import java.util.Scanner;


public class B3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int[10];
		int result[] = new int[10];
		int di[] = new int[10];
		
		int length = Array.length;
		
		int temp = 0;
		int count = 1;
		
		
		for(int i = 0; i < length; i++) {
			Array[i] = sc.nextInt();
		}
		
		for(int i = 0; i < length; i++) {
			result[i] = Array[i]%42;
			di[i] = result[i];
		}
		
		for(int i = 0; i<length; i++) {
			temp = result[i];
			for(int j = i; j<length; j++) {
				if(temp != di[i]) {
					count++;
				}
			}
			
		}
		
		
		System.out.print(count);
		
		
	}

}
