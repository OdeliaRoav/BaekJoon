import java.util.Scanner;

public class B10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int Array[] = new int[a];
		
		
		
		for(int i = 0 ; i < a; i ++) {
			Array[i] = sc.nextInt();
		}
		
		for(int i = 0; i<a; i++) {
			if(Array[i]<b) {
				System.out.print(Array[i] + " ");
			}
		}
	
	}

}
