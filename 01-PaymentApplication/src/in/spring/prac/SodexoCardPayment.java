package in.spring.prac;

public class SodexoCardPayment implements IPayment {

	@Override
	public boolean proccessPayment(double billAmt) {
		System.out.println("Sodexo Card Payment Successful...");
		return true;
	}
}
