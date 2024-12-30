import java.util.Scanner;

public class B3040{
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		
		
		int array[] = new int[9];
		int sum = 0;
		for(int i = 0; i<9; i++) {
			array[i] = In.nextInt();
			sum += array[i];
		}
		
		for(int i = 0; i< 8; i++) {
			for(int j = i+1; j<9; j++) {
				int current = array[i] + array[j];
				
				if(sum - current ==100) {
					array[i] = 0;
					array[j] = 0;
					for(int k = 0; k<9; k++) {
						if(k!=i&&k!=j) {
							System.out.println(array[k]);
						}
					}
				}
			}
		}
		
		
	}
}