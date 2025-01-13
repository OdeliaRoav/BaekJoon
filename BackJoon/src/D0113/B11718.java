package D0113;

import java.util.Scanner;

public class B11718{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()) { 
            String input = sc.nextLine(); 
            if (input.trim().isEmpty()) {
                break;
            }

            
            System.out.println(input);
        }

        sc.close();
    }
}

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        while (true) {
            String input = sc.nextLine(); 
            if (input.trim().isEmpty()) {
                break;
            }
            System.out.println(input);
        }

    }
} 이 코드는 오류가 나는데 왜 나는지 모르겠음 정답 맞춘 코드는 도움 받고 품.
*/ 