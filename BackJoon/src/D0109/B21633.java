package D0109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B21633 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		if(25+(a*0.01)>2000) {
			System.out.printf("%.2f", 2000.0);
		}
		else if (25+(a*0.01)<100) {
			System.out.printf("%.2f", 100.0);
		}
		else {
			System.out.printf("%.2f", 25+(a*0.01));
		}
	//printf로 보낼때 ""안에 %d인지 %f인지 구분해서 작성해야함.
	}

}
