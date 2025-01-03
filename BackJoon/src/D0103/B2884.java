package D0103;
import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H>=0&&H<=23&&M>=0&&M<=59) {
			if(M>=45) {
				M = M-45;
			}
			else if(M<45){
				M = M-44+59;
				if(H == 0) {
					H = 23;
				}
				else {
					H = H -1;
				}
			}
			System.out.print(H + " " + M);
		}
		else {
			System.out.print("Error");
		}
		
	}

}
