package in.spring.prac;

public class AmexCardPayment implements IPayment {

	@Override
	public boolean proccessPayment(double billAmt) {
		System.out.println("Amex Card Payment Successful...");
		return true;
	}
}
