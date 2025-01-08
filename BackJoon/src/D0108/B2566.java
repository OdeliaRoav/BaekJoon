package D0108;

import java.util.Scanner;

public class B2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[][] = new int[9][9];
		
		
		
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				Array[i][j] = sc.nextInt();
			}
		}
		int a = 0;
		int b = 0;
		
		int temp = Array[0][0];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(temp<=Array[i][j]) { //좌표 위치 0,0일 때를 포함해야한다. 
					temp = Array[i][j];
					a = i+1;
					b = j+1;
				}
			}
		}
		System.out.println(temp);
		System.out.print(a + " " + b);
		
		
	}

}
