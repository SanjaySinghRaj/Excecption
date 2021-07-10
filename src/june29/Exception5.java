package june29;

public class Exception5 {

	public static void main(String[] args) {
		int amt=20;
		if(amt>0&&amt<=15000&&amt%100==0) {
			System.out.println("Your transiction is successfully");
		}
		else {
			throw new AmtException();
		}
		System.out.println("Thankyou");

	}

}
