package D0113;

import java.util.Scanner;

public class B5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

	
        char[] chars = str.toCharArray();
		
        int sum = 0;
        for (char c : chars) {
		    if (c >= 'A' && c <= 'C') { // A~C
                sum += 3;
		    } else if (c >= 'D' && c <= 'F'){ // D~F
                sum +=4;
		    } else if (c >= 'G' && c <= 'I'){ // G~I
                sum +=5; 
			}else if (c >= 'J' && c <= 'L'){ // J~L
                sum +=6;
		    }else if (c >= 'M' && c <= 'O'){ // M~O
                sum +=7;
		    }else if (c >= 'P' && c <= 'S'){ // P~S
                sum +=8;
		    }else if (c >= 'T' && c <= 'V'){ // T~V
                sum +=9;
		    }else if (c >= 'W' && c <= 'Z'){ // W~Z
                sum +=10;
            }
        }
        System.out.println(sum);
    }
}