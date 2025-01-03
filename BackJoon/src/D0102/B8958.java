package D0102;
import java.util.Scanner;


public class B8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Array[] = new String[80];
		int result[] = new int[10];
		int count = 1;
		int sum = 0;
		
		int a = sc.nextInt();
		for(int i = 0; i<a; i++) {
			Array[i] = sc.next();
		}
		
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<Array[i].length(); j++) {
				if(Array[i].charAt(j) == 'O') {
					sum += count;
					count++;
				}
				else if(Array[i].charAt(j) == 'X') {
					count = 1;
				}
			}
			result[i] = sum;
			sum = 0;
			count = 1;
		}
		
		for(int i = 0; i<a; i++) {
			System.out.println(result[i]);
		}
	}
} //런타임 에러 뜨는 데 이유는 잘 모르겠음

// 아래는 인터넷 코드 가져온 것 
/*import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String arr[] = new String[in.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}
		
		in.close();
		
		for (int i = 0; i < arr.length; i++) {
			
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산 
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} 
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
		}
	}
}
*/