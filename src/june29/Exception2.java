package june29;

public class Exception2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(1);
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			System.out.println("one not divide by 0");
		}
		finally {
			System.out.println(1);
			System.out.println(2);
			
		}

	}

}
