package D0321;

import java.util.Scanner;

public class B1254 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int ans = 0;

        for (int i = 0; i < len; i++) {
            ans = 1; 

            for (int j = 0; j < (len - i) / 2; j++) {
                if (s.charAt(i + j) != s.charAt(len - 1 - j)) {
                    ans = 0; 
                    break;
                }
            }

            if (ans == 1) {
                System.out.println(len + i);
                break;
            }
        }
    }
}
