package D0102;
import java.util.Scanner;

public class B1193T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		sc.close();
		
		int a = 1, b = 1, cnt = 1;
		
		enum DIRECT {RIGHT, LEFTDOWN, DOWN, RIGHTUP};
		DIRECT dir = DIRECT.RIGHT;
		
		while(true) {
			if(x == cnt) break;
			
			
			if(dir == DIRECT.RIGHT) {
				b++;
				dir = DIRECT.LEFTDOWN;
			}
			else if( dir == DIRECT.LEFTDOWN) {
				a++;
				b--;
				if(cnt ==0) {
					dir = DIRECT.DOWN;
				}
			}
			else if ( dir == DIRECT.DOWN) {
				a++;
				dir = DIRECT.RIGHTUP;
			}
			else if ( dir == DIRECT.RIGHTUP) {
				a--;
				b++;
				if(cnt-- == 0) {
					dir = DIRECT.RIGHT;
				}

			}
			cnt++;
			
		}
		
		
		
	}

}
