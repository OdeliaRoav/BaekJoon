package Book;

public class MethodCall {

	public static void main(String[] args) {
		Method.printName();
		
		Method m = new Method();
		m.printEmail();
		m.printId();
		
		Method m2 = new Method();
		m2.printEmail();
		m2.printId();
	}

}
