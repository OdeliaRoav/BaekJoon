package D0109;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class B4299 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		boolean chk = false;

		if(B > A || A < 0 || B < 0){
		    System.out.println(-1);
		    chk = true;
		}

		int X = (A+B)/2, Y = (A-B)/2;

		if(X+Y == A && X-Y == B && !chk){
		    System.out.println(X + " " + Y);
		} else if(!chk){
		    System.out.println(-1);
		}

	}
}
