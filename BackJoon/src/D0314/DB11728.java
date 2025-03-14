package D0314;

import java.util.Scanner;

public class DB11728 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] Array = new int[a];
        int[] Array2 = new int[b];
        int[] result = new int[a + b];

        
        for (int i = 0; i < a; i++) {
            Array[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            Array2[i] = sc.nextInt();
        }

        
        int i = 0, j = 0, k = 0;
        while (i < a && j < b) {
            if (Array[i] < Array2[j]) {
                result[k++] = Array[i++];
            } else {
                result[k++] = Array2[j++];
            }
        }


        while (i < a) {
            result[k++] = Array[i++];
        }
        while (j < b) {
            result[k++] = Array2[j++];
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
