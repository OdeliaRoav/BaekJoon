package D1230;
import java.util.Scanner;
public class B2588 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int alpha = a.nextInt();
		int beta = a.nextInt();
		
		int b = alpha*(beta%10);
		int c = alpha*((beta/10)%10);
		int d = alpha*(((beta/10)/10)%10);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int sum = b+c*10+d*100;
		
		System.out.println(sum);
		
	}

}
