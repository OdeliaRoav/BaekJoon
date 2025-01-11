package Book;

public class SingletonMain {

	public static void main(String[] args) {
		//Singleton s = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		Singleton s3 = Singleton.getInstance();
		
		Singleton s4 = Singleton.getInstance();
		
		
		
	}

}
