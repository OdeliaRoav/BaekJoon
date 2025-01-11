package Book;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("객체 생성 되었습니다.");
		
		
	}
	
	public static Singleton getInstance() {
		System.out.println("객체 리턴");
		return instance;
	}
}
