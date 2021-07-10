package june29;

public class Exception3 {

	public static void main(String[] args) {
		System.out.println("start");
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("end");

	}

}
