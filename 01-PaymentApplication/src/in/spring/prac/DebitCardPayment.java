package in.spring.prac;

public class DebitCardPayment implements IPayment{

	@Override
	public boolean proccessPayment(double billAmt) {
		System.out.println("Debit Card Payment Successful...");
		return true;
	}
}
