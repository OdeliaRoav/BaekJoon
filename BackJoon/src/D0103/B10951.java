package D0103;

import java.io.IOException;
import java.util.Scanner;

public class B10951 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s[] = sc.nextLine().split(" ");
            System.out.println(Integer.parseInt(s[0]) +
                    Integer.parseInt(s[1]));
        }
    }
}
