package j4p28;

public class ClassInfoExample {

	public static void main(String[] args) {
		Car car = new Car(100);
		Class clazz = car.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		
		
	}

}
