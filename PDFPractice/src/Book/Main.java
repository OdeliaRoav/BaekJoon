package Book;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int Array[] = new int[3];
		int input[] = new int[3];
		
		
		while(true) {
			int scount = 0;
			int bcount = 0;		
			
			System.out.println("0~9까지의 숫자 입력 ");
			
			
			for(int i = 0; i < 3; i++) {
				Array[i] = (int)(Math.random()*9);
				input[i] = sc.nextInt();
			}
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(input[i] == Array[j] && i == j) {
						scount++;
					}
					else if(input[i] == Array[j] && i!=j) {
						bcount++;
					}
				}
			}
			for(int i = 0; i<3; i++) {
				System.out.print(Array[i] + " ");
			}
			
			System.out.println("스트라이크 : " + scount + "  볼 : " + bcount);
			System.out.println();
			if(scount == 3) {
				System.out.println("정답");	
				break;
			}
			
		}
		
		
			
			
		/*for(int i = 0; i<Array.length; i++) {
			System.out.print(Array[i] + " ");
		}*/
			
		
		/*for(int i = 0; i<3; i++) {
			System.out.print(input[i] + " ");
		}*/
			
		
		//Math.random()*10 => 1~10;
		//Strke 자리 일치, 숫자 일치
		//Ball 자리 불일치, 숫자 일치;
				
	
		
		
		
		
	}

}
