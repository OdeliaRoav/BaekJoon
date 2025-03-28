package D0328;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Point2 {
    int a;
    int b;

    public Point2(int a, int b) {
        this.a = a;
        this.b = b;
    }
}


public class A11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		Point2[] num = new Point2[a];
		
		for(int i = 0; i<a; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			num[i] = new Point2(x, y);
		}
		
		Arrays.sort(num, new Comparator<Point2>() {
            public int compare(Point2 p1, Point2 p2) {
                if (p1.a != p2.a) {
                    return p1.a - p2.a;  // a 기준 오름차순
                } else {
                    return p1.b - p2.b;  // a가 같으면 b 기준 오름차순
                }
            }
        });
	
		for(int i = 0; i<a; i++) {
			System.out.println(num[i].a + " " + num[i].b);
		}
		
	}

	
	
}
