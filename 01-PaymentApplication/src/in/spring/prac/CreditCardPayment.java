package in.spring.prac;

public class CreditCardPayment implements IPayment{

	@Override
	public boolean proccessPayment(double billAmt) {
		System.out.println("Credit Card Payment Successful...");
		return true;
	}
}
