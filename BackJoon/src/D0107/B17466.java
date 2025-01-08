package D0107;


import java.util.Scanner;

public class B17466 {
// 사실 이 문제에서 소수를 판별하라는 얘기는 없었기 때문에 그냥 바로 대입해서 푸는 걸 의도한 문제같다.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long p = scanner.nextLong();

        long num=1;

        for(int i=2;i<n+1;i++){ 
            num=(num*i)%p;
        }
        //여기서 %p는 for문 안에 있어도 println 안에 있어도 상관 없다.
        System.out.println(num);
        
        
      
        
        
        
    }
}
