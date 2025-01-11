package Book;

public class Param {
	void add(int x, int y) {
		int z = x+y;
		System.out.println(z);
		
	}
	
	void add2(double x, double y) {
		double z = x+y;
		System.out.println(z);
	}
	
	void add3(int ... x) {
		int sum = 0;
		for(int i = 0; i< x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
}
