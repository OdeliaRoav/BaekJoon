package D0328;

import java.util.Scanner;

class test{
	int a;
	int b;
}

public class B11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		test num [] =  new test[a];
		
		for(int i = 0; i<num.length; i++) {
			num[i] = new test();
		}
		
		for(int i = 0; i<a; i++) {
			num[i].a = sc.nextInt();
			num[i].b = sc.nextInt();
		}
	
		
		for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                if (num[j].a > num[j + 1].a || (num[j].a == num[j + 1].a && num[j].b > num[j + 1].b)) {
                	
                    test temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
		
		
		for(int i = 0; i<a; i++) {
			System.out.println(num[i].a + " " + num[i].b);
		}
		
	
	}
}
