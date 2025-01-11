package D0111;


import java.math.BigInteger;
import java.util.Scanner;

public class B1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));


    }
}